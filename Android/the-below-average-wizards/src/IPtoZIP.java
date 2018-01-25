import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by adamr_000 on 11/4/2015.
 */
public class IPtoZIP {

    private JsonElement jse;


    public IPtoZIP(){
        jse = null;

        try
        {

            // Construct Bitly API URL
            URL bitlyURL = new URL("http://ipinfo.io/json");

            // Open the URL
            InputStream is = bitlyURL.openStream(); // throws an IOException
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


    public String getZip(){
        return jse.getAsJsonObject().get("postal").getAsString();
    }

    public JsonElement getJSON(){
        return jse;
    }


}
