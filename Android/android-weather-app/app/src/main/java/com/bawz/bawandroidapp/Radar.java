package com.bawz.bawandroidapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Radar extends AppCompatActivity {

    String zipcodeString, imageURL;
    private final String API = "61ba5f39fe397160"; //"340d3d982d67bef5" can be used
    Intent intent;
    WebView radarImage;
    MyTask getRadar = new MyTask();

    public Radar() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        intent = getIntent();
        zipcodeString = intent.getStringExtra("zipString");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);
        radarImage = (WebView) findViewById(R.id.imageButton);
        getRadar.execute();
    }
    private class MyTask extends AsyncTask <Void, Void, String> {

        protected String doInBackground(Void...params) {
           //http://api.wunderground.com/api/61ba5f39fe397160/animatedradar/q/MI/92092.gif?radius=25&width=1000&height=1200&newmaps=1
                imageURL = "http://api.wunderground.com/api/" + API + "/animatedradar/q/MI/" +
                        zipcodeString + ".gif?radius=15&width=300&height=475&newmaps=1";
                return imageURL;
        }

        protected void onPostExecute(String result) {
            radarImage.loadUrl(result);
        }
    }
}
