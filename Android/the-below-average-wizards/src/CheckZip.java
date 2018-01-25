import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Checks if a zipcode is real
 *
 * @author Ed Prokopik
 *
 */
public class CheckZip
{
    static JsonElement zipJse = null;
    static String id = "4b31b059-f297-e3ba-fc56-f32b260e29e6";
    static String token = "JnWQQwjeOUPj7V5e7tCT";
    static JsonElement test = null;
    public CheckZip()
    {



    }

    public static void main(String[] args)
    {
        CheckZip test = new CheckZip();
        test.getZipJson(11111);
        System.out.print("" + zipJse);
    }

        /*
         * this method will return true if the zip code is real
         * @author Ed Prokopik
         *
         *
         */

        public boolean getZipJson(double zip) {
            String currentURL = ("https://api.smartystreets.com/zipcode?auth-id=" +
                    id + "&auth-token=" + token + "&zipcode=" + zip);
            String failedURL = ("https://api.smartystreets.com/zipcode?auth-id=" +
                    id + "&auth-token=" + token + "&zipcode=" + 11111);


            try {


                URL url = new URL(currentURL);
                URLConnection request = (URLConnection) url.openConnection();
                request.connect();

                JsonParser jp = new JsonParser(); //from gson
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));

                URL url2 = new URL(failedURL);

                URLConnection request2 = (URLConnection) url2.openConnection();
                request2.connect();

                JsonParser jp2 = new JsonParser(); //from gson
                JsonElement root2 = jp2.parse(new InputStreamReader((InputStream) request2.getContent()));



                test = root2;


                zipJse = root;



            }
            catch (java.io.UnsupportedEncodingException uee) {
                uee.printStackTrace();
            }
            catch (java.net.MalformedURLException mue) {
                mue.printStackTrace();
            }
            catch (java.io.IOException ioe) {
                ioe.printStackTrace();
            }

            if (zipJse == test) {

                return false;
            } else {

                return true;
            }


        }


}