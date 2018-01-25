package com.bawz.bawandroidapp;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.JsonElement;

public class SevenDayForecast extends AppCompatActivity {

    double zipDbl;
    JsonElement j;
    Intent i = getIntent();
    MyTask task = new MyTask();

    ImageView day1Icon;
    ImageView day2Icon;
    ImageView day3Icon;
    ImageView day4Icon;
    ImageView day5Icon;
    ImageView day6Icon;
    ImageView day7Icon;

    TextView day1Label;
    TextView day2Label;
    TextView day3Label;
    TextView day4Label;
    TextView day5Label;
    TextView day6Label;
    TextView day7Label;

    TextView date1Label;
    TextView date2Label;
    TextView date3Label;
    TextView date4Label;
    TextView date5Label;
    TextView date6Label;
    TextView date7Label;

    TextView highTemp1;
    TextView highTemp2;
    TextView highTemp3;
    TextView highTemp4;
    TextView highTemp5;
    TextView highTemp6;
    TextView highTemp7;

    TextView lowTemp1;
    TextView lowTemp2;
    TextView lowTemp3;
    TextView lowTemp4;
    TextView lowTemp5;
    TextView lowTemp6;
    TextView lowTemp7;

    TextView wind1;
    TextView wind2;
    TextView wind3;
    TextView wind4;
    TextView wind5;
    TextView wind6;
    TextView wind7;


    GetWeather info = new GetWeather();

    public SevenDayForecast() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        String value = i.getStringExtra("zipString");
        zipDbl = Double.parseDouble(value);
        task.execute();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_seven_day_forecast);

        day1Icon = (ImageView) findViewById(R.id.day1);
        day2Icon = (ImageView) findViewById(R.id.day2);
        day3Icon = (ImageView) findViewById(R.id.day3);
        day4Icon = (ImageView) findViewById(R.id.day4);
        day5Icon = (ImageView) findViewById(R.id.day5);
        day6Icon = (ImageView) findViewById(R.id.day6);
        day7Icon = (ImageView) findViewById(R.id.day7);

        day1Label = (TextView) findViewById(R.id.day1Label);
        day2Label = (TextView) findViewById(R.id.day2Label);
        day3Label = (TextView) findViewById(R.id.day3Label);
        day4Label = (TextView) findViewById(R.id.day4Label);
        day5Label = (TextView) findViewById(R.id.day5Label);
        day6Label = (TextView) findViewById(R.id.day6Label);
        day7Label = (TextView) findViewById(R.id.day7Label);

        date1Label = (TextView) findViewById(R.id.Date1Label);
        date2Label = (TextView) findViewById(R.id.Date2Label);
        date3Label = (TextView) findViewById(R.id.Date3Label);
        date4Label = (TextView) findViewById(R.id.Date4Label);
        date5Label = (TextView) findViewById(R.id.Date5Label);
        date6Label = (TextView) findViewById(R.id.Date6Label);
        date7Label = (TextView) findViewById(R.id.Date7Label);

        highTemp1 = (TextView) findViewById(R.id.highTemp1);
        highTemp2 = (TextView) findViewById(R.id.highTemp2);
        highTemp3 = (TextView) findViewById(R.id.highTemp3);
        highTemp4 = (TextView) findViewById(R.id.highTemp4);
        highTemp5 = (TextView) findViewById(R.id.highTemp5);
        highTemp6 = (TextView) findViewById(R.id.highTemp6);
        highTemp7 = (TextView) findViewById(R.id.highTemp7);

        lowTemp1 = (TextView) findViewById(R.id.lowTemp1);
        lowTemp2 = (TextView) findViewById(R.id.lowTemp2);
        lowTemp3 = (TextView) findViewById(R.id.lowTemp3);
        lowTemp4 = (TextView) findViewById(R.id.lowTemp4);
        lowTemp5 = (TextView) findViewById(R.id.lowTemp5);
        lowTemp6 = (TextView) findViewById(R.id.lowTemp6);
        lowTemp7 = (TextView) findViewById(R.id.lowTemp7);

        wind1 = (TextView) findViewById(R.id.wind1);
        wind2 = (TextView) findViewById(R.id.wind2);
        wind3 = (TextView) findViewById(R.id.wind3);
        wind4 = (TextView) findViewById(R.id.wind4);
        wind5 = (TextView) findViewById(R.id.wind5);
        wind6 = (TextView) findViewById(R.id.wind6);
        wind7 = (TextView) findViewById(R.id.wind7);

        getDay1Info();
        getDay2Info();
        getDay3Info();
        getDay4Info();
        getDay5Info();
        getDay6Info();
        getDay7Info();

      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

    public void getDay1Info() {
        int x = parseDay1Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(1);
        day1Icon.setImageResource(x);
        day1Label.setText(s);

        String c1 = info.getDayInputMonth(1);
        String c2 = info.getDayInputDayOfMonth(1);
        CharSequence cs = c1 + c2;
        date1Label.setText(cs);

        double h = info.getDay1High();
        i = (int) h;
        String hs = i + "F";
        highTemp1.setText(hs);

        double l = info.getDay1Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp1.setText(ls);

        double w = info.getDay1WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind1.setText(ws);
    }

    public void getDay2Info() {
        int x = parseDay2Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(2);
        day2Icon.setImageResource(x);
        day2Label.setText(s);

        String c1 = info.getDayInputMonth(2);
        String c2 = info.getDayInputDayOfMonth(2);
        CharSequence cs = c1 + c2;
        date2Label.setText(cs);

        double h = info.getDay2High();
        i = (int) h;
        String hs = i + "F";
        highTemp2.setText(hs);

        double l = info.getDay2Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp2.setText(ls);

        double w = info.getDay2WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind2.setText(ws);
    }

    public void getDay3Info() {
        int x = parseDay3Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(3);
        day3Icon.setImageResource(x);
        day3Label.setText(s);

        String c1 = info.getDayInputMonth(3);
        String c2 = info.getDayInputDayOfMonth(3);
        CharSequence cs = c1 + c2;
        date3Label.setText(cs);

        double h = info.getDay3High();
        i = (int) h;
        String hs = i + "F";
        highTemp3.setText(hs);

        double l = info.getDay3Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp3.setText(ls);

        double w = info.getDay3WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind3.setText(ws);
    }

    public void getDay4Info() {
        int x = parseDay4Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(4);
        day4Icon.setImageResource(x);
        day4Label.setText(s);

        String c1 = info.getDayInputMonth(4);
        String c2 = info.getDayInputDayOfMonth(4);
        CharSequence cs = c1 + c2;
        date4Label.setText(cs);

        double h = info.getDay4High();
        i = (int) h;
        String hs = i + "F";
        highTemp4.setText(hs);

        double l = info.getDay4Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp4.setText(ls);

        double w = info.getDay4WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind4.setText(ws);
    }

    public void getDay5Info() {
        int x = parseDay5Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(5);
        day5Icon.setImageResource(x);
        day5Label.setText(s);

        String c1 = info.getDayInputMonth(5);
        String c2 = info.getDayInputDayOfMonth(5);
        CharSequence cs = c1 + c2;
        date5Label.setText(cs);

        double h = info.getDay5High();
        i = (int) h;
        String hs = i + "F";
        highTemp5.setText(hs);

        double l = info.getDay5Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp5.setText(ls);

        double w = info.getDay5WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind5.setText(ws);
    }

    public void getDay6Info() {
        int x = parseDay6Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(6);
        day6Icon.setImageResource(x);
        day6Label.setText(s);

        String c1 = info.getDayInputMonth(6);
        String c2 = info.getDayInputDayOfMonth(6);
        CharSequence cs = c1 + c2;
        date6Label.setText(cs);

        double h = info.getDay6High();
        i = (int) h;
        String hs = i + "F";
        highTemp6.setText(hs);

        double l = info.getDay6Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp6.setText(ls);

        double w = info.getDay6WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind6.setText(ws);
    }
    
    public void getDay7Info() {
        int x = parseDay7Icon();
        int i;
        CharSequence s = info.getDayInputWeekday(7);
        day7Icon.setImageResource(x);
        day7Label.setText(s);

        String c1 = info.getDayInputMonth(7);
        String c2 = info.getDayInputDayOfMonth(7);
        CharSequence cs = c1 + c2;
        date7Label.setText(cs);

        double h = info.getDay7High();
        i = (int) h;
        String hs = i + "F";
        highTemp7.setText(hs);

        double l = info.getDay7Low();
        i = (int) l;
        String ls = i + "F";
        lowTemp7.setText(ls);

        double w = info.getDay7WindSpeed();
        i = (int) w;
        String ws = "" + i;
        wind7.setText(ws);
    }

    public int parseDay1Icon(){
        String weather = info.getCurrentWeather();
        int address = 0;

        if (weather.contains("Clear")){
            /*try {
              // ImageView icon = (ImageView) findViewById(R.id.day1);
            }
            catch (NullPointerException e) {
                e.printStackTrace();
            }*/
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay2Icon(){
        String weather = info.getDay2Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay3Icon(){
        String weather = info.getDay3Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay4Icon(){
        String weather = info.getDay4Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay5Icon(){
        String weather = info.getDay5Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay6Icon(){
        String weather = info.getDay6Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    public int parseDay7Icon(){
        String weather = info.getDay7Weather();
        int address = 0;

        if (weather.contains("Clear")){
            address = R.drawable.sunny;
        }
        else if(weather.contains("Partly Cloudy")) {
            address = R.drawable.partly_cloudy;
        }
        else if(weather.contains("Overcast") || weather.contains("Mostly Cloudy")) {
            address = R.drawable.cloudy;
        }
        else if(weather.contains("Snow")) { //somewhere in the string there is the word "Snow"
            address = R.drawable.snowy;
        }
        else if(weather.contains("Rain") || weather.contains("Drizzle")) {
            address = R.drawable.rainy;
        }
        else if (weather.contains("Showers")) {
            address = R.drawable.showers;
        }
        else {
            address = R.drawable.unknown;
        }
        return address;
    }

    private class MyTask extends AsyncTask<Void, Void, JsonElement> {
        @Override
        protected JsonElement doInBackground(Void... params) {

            try {
                info.getJson(zipDbl);
                //j = info.get7DayJson();

            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;

        }

    }
}