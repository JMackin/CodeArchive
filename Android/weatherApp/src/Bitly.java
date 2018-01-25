import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;

import com.google.gson.*;

public class Bitly
{
    // Bitly OAuth access token (a unique ID).
    // You can register for your own access token, or use the one here.
    private final String WUNDER_TOKEN = "808984f8cfc56cda";
    private JsonElement jse;

    public Bitly (String zipCode)
    {
        jse = null;

        try
        {

            // Construct Bitly API URL
            URL wundUrl = new URL("http://api.wunderground.com/api/"
                    + WUNDER_TOKEN + "/conditions/q/"
                    + zipCode + ".json");

            // Open the URL
            InputStream is = wundUrl.openStream(); // throws an IOException
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
            System.out.println(jse.toString());


        }
    }

    public String getCity()
    {
        String userCity;
        userCity = jse.getAsJsonObject().get("current_observation")
                .getAsJsonObject().get("display_location")
                .getAsJsonObject().get("city").getAsString();
        return userCity;
    }

    public String getWeather()
    {
        String userWeather;
        userWeather = jse.getAsJsonObject().get("current_observation")
                .getAsJsonObject().get("weather").getAsString();
        return userWeather;
    }

    public String getTemperature()
    {
    String userTempe;
    userTempe = jse.getAsJsonObject().get("current_observation")
            .getAsJsonObject().get("temp_f").getAsString();
    return userTempe + " F";
    }

    public String getWind()
    {
        String userWind;
        userWind = jse.getAsJsonObject().get("current_observation")
                .getAsJsonObject().get("wind_mph").getAsString();
        return userWind + " mph";
    }

    public static void main(String[] args)
    {
        Bitly b = new Bitly(args[0]);


    }
}