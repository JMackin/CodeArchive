package com.bawz.bawandroidapp;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;
import java.net.*;
import java.io.*;
import java.io.IOException;
import com.google.gson.*;

public class GetWeather {
    static JsonElement jse = null;
    static JsonElement jse7Day = null;
    JsonObject jobject = null;
    private final String API = "61ba5f39fe397160"; //"61ba5f39fe397160" can be used if too many calls 340d3d982d67bef5
    //public ImageIcon ii; Javax not supported
    static String message = "Error, invalid zipcode";




    /*
     * gets the json data and puts into variables
     * @ author Ed Prokopik
     */
    public void getJson(double zip) {
        String currentURL = ("http://api.wunderground.com/api/" + API + "/conditions/q/"
                + zip + ".json");

        String forecastURL = ("http://api.wunderground.com/api/" + API + "/forecast10day/q/" + zip + ".json");


        try {


            URL url = new URL(currentURL);
            URLConnection request = (URLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootobj = root.getAsJsonObject();


            URL url2 = new URL(forecastURL);

            URLConnection request2 = (URLConnection) url2.openConnection();
            request2.connect();

            JsonParser jp2 = new JsonParser(); //from gson
            JsonElement root2 = jp2.parse(new InputStreamReader((InputStream) request2.getContent()));


            jse = root;
            jse7Day = root2;


        }
        catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }
        catch (MalformedURLException mue) {
            mue.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (jse != null) {

        }

        else {

        }
    }
    /*
     * two methods to return json data
     *@ author Ed Prokopik
     */
    public JsonElement getCurrentJson() {

        return jse;
    }

    public JsonElement get7DayJson() {

        return jse7Day;
    }


    public static void main(String[] args)
    {
        GetWeather test = new GetWeather();
        test.getJson(95677);
        
        
        System.out.println("Current Conditions: ");
        System.out.println("\t" +test.getCity());
        System.out.println("\t" +test.getCurrentWeather());
        System.out.println("\t" +test.getCurrentTemperature());
        System.out.println("\t" +test.getCurrentWindSpeed());
      
        System.out.println("7 Day Weather (starts with day after current day)");
        System.out.println("\t" +test.getDay1Weather());
        System.out.println("\t" +test.getDay2Weather());
        System.out.println("\t" +test.getDay3Weather());
        System.out.println("\t" +test.getDay4Weather());
        System.out.println("\t" +test.getDay5Weather());
        System.out.println("\t" +test.getDay6Weather());
        System.out.println("\t" +test.getDay7Weather());
        
        System.out.println("7 Day Highs (in fahrenheit)");
        System.out.println("\t" +test.getDay1High());
        System.out.println("\t" +test.getDay2High());
        System.out.println("\t" +test.getDay3High());
        System.out.println("\t" +test.getDay4High());
        System.out.println("\t" +test.getDay5High());
        System.out.println("\t" +test.getDay6High());
        System.out.println("\t" +test.getDay7High());
        
        System.out.println("7 Day Lows (in fahrenheit)");
        System.out.println("\t" +test.getDay1Low());
        System.out.println("\t" +test.getDay2Low());
        System.out.println("\t" +test.getDay3Low());
        System.out.println("\t" +test.getDay4Low());
        System.out.println("\t" +test.getDay5Low());
        System.out.println("\t" +test.getDay6Low());
        System.out.println("\t" +test.getDay7Low());
        
        System.out.println("7 Day Wind Speed (average speed in mph)");
        System.out.println("\t" +test.getDay1WindSpeed());
        System.out.println("\t" +test.getDay2WindSpeed());
        System.out.println("\t" +test.getDay3WindSpeed());
        System.out.println("\t" +test.getDay4WindSpeed());
        System.out.println("\t" +test.getDay5WindSpeed());
        System.out.println("\t" +test.getDay6WindSpeed());
        System.out.println("\t" +test.getDay7WindSpeed());

        System.out.println(test.getDayInputMonth(1));
        System.out.println(test.getDayInputWeekday(1));
        System.out.println(test.getDayInputDayOfMonth(1));
        
       
    }




    public String getCity() {
        JsonObject cityTemp = jse.getAsJsonObject().get("current_observation").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("display_location").getAsJsonObject();
        return  cityTemp2.get("city").getAsString();
    }

     //////////////////////////////
    // Current Conditions
    /*
     * @ author Ed Prokopik
     *
     */
    public String getCurrentWeather() {
        JsonObject weatherTemp = jse.getAsJsonObject().get("current_observation").getAsJsonObject();

        return  weatherTemp.get("weather").getAsString();
    }

    public double getCurrentTemperature() {
        JsonObject temperatureTemp = jse.getAsJsonObject().get("current_observation").getAsJsonObject();

        return  temperatureTemp.get("temp_f").getAsDouble();
    }

    public double getCurrentWindSpeed() {
        JsonObject windTemp = jse.getAsJsonObject().get("current_observation").getAsJsonObject();

        return  windTemp.get("wind_mph").getAsDouble();
    }

    /*
     * gets the current weather icon.
     * @author Adam Reed
     */
    /*public ImageIcon getCurrentWeatherIcon(){
        String url = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    } Unused method. Possible copy or reference. */


       /////////////////////////////////
      // 7 Day Forecast Weather
     // These methods return a string with the conditions
    // but I could change it to return the url to an image of the condition
    /*
     * @ author Ed Prokopik
     *
     */

    public String getDay1Weather() { //day 1 is the first day after the current day
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(1).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }

    public String getDay2Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(2).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();
    }

    public String getDay3Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(3).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }

    public String getDay4Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(4).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }
    public String getDay5Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(5).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }

    public String getDay6Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(6).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }

    public String getDay7Weather() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(7).getAsJsonObject();
        return citytemp4.get("conditions").getAsString();

    }

     /////////////////////////////////////
    // 7 Day Forecast Temperature
    /*
     * @ author Ed Prokopik
     *
     */

    public double getDay1High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(1).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();

    }
    public double getDay2High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(2).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay3High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(3).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    public double getDay4High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(4).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay5High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(5).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    public double getDay6High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(6).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay7High() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(7).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("high").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    
    
    
    public double getDay1Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(1).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();

    }
    public double getDay2Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(2).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay3Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(3).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    public double getDay4Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(4).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay5Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(5).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    public double getDay6Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(6).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDay7Low() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(7).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }
    public double getDayInputLow(int day) {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(day).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("low").getAsJsonObject();
        return citytemp5.get("fahrenheit").getAsDouble();


    }

    // ********* WIND DIRECTION FOR MAIN ***********
    public String getCurrentWindDirection(){
        String direction = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("wind_dir").getAsString();
        return direction;
    }
    public double getCurrentWindDegrees(){
        double direction = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("wind_degrees").getAsDouble();
        return direction;
    }

    ////////////////////////////////////
    // 7 Day Wind Speed
    /*
     * @ author Ed Prokopik
     *
     */

    public double getDay1WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(1).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();


    }
    public double getDay2WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(2).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }
    public double getDay3WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(3).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }

    public double getDay4WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(4).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }
    public double getDay5WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(5).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }

    public double getDay6WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(6).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }
    public double getDay7WindSpeed() {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(7).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }

    public double getDayInputWindSpeed(int day) {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(day).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("avewind").getAsJsonObject();
        return citytemp5.get("mph").getAsDouble();



    }

    /*
     * these methods get month, weekday, and day of month
     * @author Ed Prokopik
     */

    public String getDayInputMonth(int day) {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(day).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("date").getAsJsonObject();
        return citytemp5.get("monthname_short").getAsString();

    }

    public String getDayInputWeekday(int day) {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(day).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("date").getAsJsonObject();
        return citytemp5.get("weekday_short").getAsString();

    }

    public String getDayInputDayOfMonth(int day) {
        JsonObject cityTemp = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject();
        JsonObject cityTemp2 = cityTemp.getAsJsonObject().get("simpleforecast").getAsJsonObject();
        JsonElement cityTemp3 = cityTemp2.get("forecastday");
        JsonObject citytemp4 = cityTemp3.getAsJsonArray().get(day).getAsJsonObject();
        JsonObject citytemp5 = citytemp4.getAsJsonObject().get("date").getAsJsonObject();
        return citytemp5.get("day").getAsString();

    }


    //*******Get Icons*******

    /*
     * Get's the second day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay2WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                             get("simpleforecast").getAsJsonObject().get("forecastday").
                             getAsJsonArray().get(2).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }

    /*
     * Get's the Third day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay3WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(3).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }*/

    /*
     * Get's the Fourth day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay4WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(4).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }

    /*
     * Get's the Fifth day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay5WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(5).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }


    /*
     * Get's the Sixth day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay6WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(6).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }

    /*
     * Get's the Seventh day icon.
     * @author Adam Reed
     */
    /*
    public ImageIcon getDay7WeatherIcon(){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(7).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }

    */
    /*
     * Gets what ever day you want.
     * @author Adam Reed
     * @param day The day you would like to get.
     */
    /*
    public ImageIcon getDayInputWeatherIcon(int day){
        String url = jse7Day.getAsJsonObject().get("forecast").getAsJsonObject().
                get("simpleforecast").getAsJsonObject().get("forecastday").
                getAsJsonArray().get(day).getAsJsonObject().get("icon_url").getAsString();
        ImageIcon icon = new ImageIcon();
        try {
            icon = new ImageIcon(new URL(url));
        } catch (Exception e){
            e.printStackTrace();
        }
        return icon;

    }
    */
/*
 * Radar image
 * @author Caitlyn Towne
 */
    /*
    protected ImageIcon createImageIcon(String path, String description)
    {
        try
        {
            URL imgURL = new URL(path);
            ii = new ImageIcon(imgURL, description);
        }
        catch (MalformedURLException mue)
        {
            mue.printStackTrace();
        }
        return ii;
    }

    public ImageIcon getImage(String zipcodeString, String radarType)
    {
        return createImageIcon("http://api.wunderground.com/api/" + API + "/" + radarType + "/q/MI/" +
                zipcodeString + ".gif?newmaps=1","Radar Image");
    }
    */
}