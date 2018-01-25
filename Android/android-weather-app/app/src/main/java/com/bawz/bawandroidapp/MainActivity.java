package com.bawz.bawandroidapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.location.Location;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.google.gson.JsonElement;

import java.io.IOException;
import java.net.MalformedURLException;

public class MainActivity extends AppCompatActivity {

    //CONSTANTS:
    public final int REQUEST_LOCATION = 1;
    double accessorZip;

    //Variables
    private EditText zipInput;
    private TextView zipOutput, titleView, conditionsOutput, windDirection, cityOut;
    private TextClock textClock;
    private ImageView temperatureIcon, arrowIcon, compassIcon;
    private TextView temperatureOutput;
    private ImageView currentConditions;
    private MediaPlayer transition, wizardSupprise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zipInput = (EditText) findViewById(R.id.zipCode);
        zipInput.setClickable(false);
        //zipOutput = (TextView) findViewById(R.id.textOutput);
        titleView = (TextView) findViewById(R.id.textTitle);
        textClock = (TextClock) findViewById(R.id.textClock);

        temperatureIcon = (ImageView) findViewById(R.id.temperatureIcon);
        temperatureOutput = (TextView) findViewById(R.id.temperatureOut);

        currentConditions = (ImageView) findViewById(R.id.currentConditions);
        conditionsOutput = (TextView) findViewById(R.id.conditionsText);

        transition = MediaPlayer.create(this,R.raw.transition);
        wizardSupprise = MediaPlayer.create(this,R.raw.tf2supprise);

        cityOut = (TextView) findViewById(R.id.cityOut);

        //********************* WIND ********************
        arrowIcon = (ImageView)findViewById(R.id.arrowIcon);
        compassIcon = (ImageView) findViewById(R.id.compass);
        windDirection = (TextView) findViewById(R.id.weatherDirection);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        /************ SET FONTS **********/
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/radioland.tff");
        titleView.setTypeface(typeface);
        textClock.setTypeface(typeface);

        /************ SET COLORS *********/
        temperatureIcon.setColorFilter(Color.WHITE);
        arrowIcon.setColorFilter(Color.parseColor("#6caeff"));


        //BUTTON ACTION LISTENER
        final Button fab = (Button) findViewById(R.id.zipButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    int zipCodeTemp = Integer.parseInt(zipInput.getText().toString());
                    if(zipCodeTemp > 550 && zipCodeTemp < 99999 && !zipInput.getText().toString().equals("Invalid Zip") && !zipInput.getText().toString().equals("Zip Code") && !zipInput.getText().toString().equals("")){
                        MyTask temp = new MyTask();
                        accessorZip = (Double.parseDouble(zipInput.getText().toString()));
                        temp.setZip(Double.parseDouble(zipInput.getText().toString()));
                        temp.execute();
                        transition.start();
                    } else {
                        zipInput.setText("Invalid Zip");
                    }

                } catch(Exception e){
                    e.printStackTrace();
                }

            }
        });

        zipInput.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(zipInput.getText().toString().equals("Zip Code") || zipInput.getText().toString().equals("Invalid Zip")){
                    zipInput.setText("");
                }
            }

        });

        //***************** WIZARD TITLE *****************

        titleView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                wizardSupprise.start();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String getWeather(double zipCode){
        GetWeather weather = new GetWeather();
        weather.getJson(Double.parseDouble(zipInput.getText().toString()));
        zipOutput.setText("City: " + weather.getCity() + "\n"+
                "Weather: " + weather.getCurrentWeather() +
                "Temperature: " +  weather.getCurrentTemperature());

        return"";
    }

// *********************************** NEW TASKS *******************************************

    private class MyTask extends AsyncTask<Void, Void, Void> {

        double zipCode = 0;
        GetWeather weather;

        public void setZip(double zipCode){
            this.zipCode = zipCode;
        }

        public double getZip(){return zipCode;}

        @Override
        protected Void doInBackground(Void... params) {

            try {

                weather = new GetWeather();
                weather.getJson(zipCode);


            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;

        }

        @Override
        protected void onPostExecute(Void result) {

            temperatureOutput.setText("" + weather.getCurrentTemperature() + " °F");
            conditionsOutput.setText("" + weather.getCurrentWeather());
            windDirection.setText("" + weather.getCurrentWindDirection());
            arrowIcon.setRotation((float) weather.getCurrentWindDegrees() - 90);
            cityOut.setText("" + weather.getCity());
            setWeatherIcon(weather.getCurrentWeather());

            super.onPostExecute(result);
        }

    }

    //button commands for forecast
    //final Button forecastButton = (Button) findViewById(R.id.sevenDayButton);
    public void startForecast(View view) {

        int zipCodeTemp = Integer.parseInt(zipInput.getText().toString());
        if(zipCodeTemp > 550 && zipCodeTemp < 99999 && !zipInput.getText().toString().equals("Invalid Zip") && !zipInput.getText().toString().equals("Zip Code") && !zipInput.getText().toString().equals("")){
            String zipStr = zipInput.getText().toString();
            Intent intent = new Intent(MainActivity.this, SevenDayForecast.class);
            intent.putExtra("zipString", zipStr);
            MainActivity.this.startActivity(intent);
        } else {
            zipInput.setText("Invalid Zip");
        }

    }

    //RADAR BUTTON
    public void startRadar(View view) {

        int zipCodeTemp = Integer.parseInt(zipInput.getText().toString());
        if(zipCodeTemp > 550 && zipCodeTemp < 99999 && !zipInput.getText().toString().equals("Invalid Zip") && !zipInput.getText().toString().equals("Zip Code")){
            String zipStr = "" + zipInput.getText().toString();
            Intent intent = new Intent(MainActivity.this, Radar.class);
            intent.putExtra("zipString", zipStr);
            MainActivity.this.startActivity(intent);
        } else {
            zipInput.setText("Invalid Zip");
        }

    }


    public void setWeatherIcon(String weather){

        switch(weather){
            case "Clear":
                currentConditions.setImageResource(R.drawable.sunny);
                break;
            case "Cloudy":
                currentConditions.setImageResource(R.drawable.cloudy);
                break;
            case "Partly Cloudy":
                currentConditions.setImageResource(R.drawable.partly_cloudy);
                break;
            case "Foggy":
                currentConditions.setImageResource(R.drawable.fog);
                break;
            case "Very Hot":
                currentConditions.setImageResource(R.drawable.sunny);
                break;
            case "Very Cold":
                currentConditions.setImageResource(R.drawable.cloudy);
                break;
            case "Mostly Sunny":
                currentConditions.setImageResource(R.drawable.sunny);
                break;
            case "Partly Sunny":
                currentConditions.setImageResource(R.drawable.partly_cloudy);
                break;
            case "Rain":
                currentConditions.setImageResource(R.drawable.rainy);
                break;
            case "Overcast":
                currentConditions.setImageResource(R.drawable.cloudy);
                break;
            case "Scattered Clouds":
                currentConditions.setImageResource(R.drawable.partly_cloudy);
                break;
            default:
                currentConditions.setImageResource(R.drawable.partly_cloudy);
                break;
        }
    }

}
