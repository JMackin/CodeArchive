import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;

import com.google.gson.*;

public class GetWeather {
    // Bitly OAuth access token (a unique ID).
    // You can register for your own access token, or use the one here.
    private final String API_KEY = "f7248480a9d5a8e5";

    public String acquireWeather(String zipStr)
    {
        JsonElement jse = null;

        try
        {
            // Encode given URL -- could throw UnsupportedEncodingException
            //String encodedURL = URLEncoder.encode(userURL, "utf-8");

            // Construct Weather Underground API URL
            URL wundergroundURL = new URL("http://api.wunderground.com/api/"
                    + API_KEY + "/conditions/q/"
                    + zipStr + ".json");

            // Open the URL
            InputStream is = wundergroundURL.openStream(); // throws an IOException
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // Read the result into a JSON Element
            jse = new JsonParser().parse(br);

            // Close the connection
            is.close();
            br.close();
        }
        catch (java.io.UnsupportedEncodingException uee)
        {
            uee.printStackTrace();
        }
        catch (java.net.MalformedURLException mue)
        {
            mue.printStackTrace();
        }
        catch (java.io.IOException ioe)
        {
            ioe.printStackTrace();
        }

        if (jse != null)
        {
            //System.out.println(jse.toString());

            // Extract shortened URL from JSON string.
            // { "data": { ... "url" : "http://bit.ly/AbCdEF" ... } }
            //String shortURL = jse.getAsJsonObject().get("data")
            //       .getAsJsonObject().get("url").getAsString();
            //return shortURL;
            String[] temp = jse.toString().split("\",\"");
            String str = "";
            for (int i = 0; i < temp.length; i++) {
                str = str + "\n" + temp[i];
            }
            //System.out.println(str);
            return str;
        }
        else
        {
            return null;
        }
    }

    public String getCity(String str) {
        String[] temp = str.split("http://www.wunderground.com/US/");
        String city = temp[1];
        temp = city.split(".html");
        city = temp[0];
        temp = city.split("/");
        city = temp[1];
        if (city.contains("_")) {
            String[] a = city.split("_");
            String result = a[0];
            for (int i = 1; i < a.length; i++) {
                result = result + " " + a[i];
            }
            return result;
        }
        else {
            return city;
        }
    }

    public String parseWeather(String str) {
        String[] temp = str.split("weather\":\"");
        String weather = temp[1];
        temp = weather.split("temperature");
        weather = temp[0];
        return weather;
    }

    public double getTemperature(String str) {
        String[] temp = str.split("temperature_string\":\"");
        String temperature = temp[1];
        temp = temperature.split(" F");
        temperature = temp[0];
        double result = Double.parseDouble(temperature);
        return result;
    }

    public double getWindSpeed(String str) {
        String[] temp = str.split("wind_mph\":");
        String wind = temp[1];
        temp = wind.split(",\"");
        wind = temp[0];
        double result = Double.parseDouble(wind);
        return result;
    }
}