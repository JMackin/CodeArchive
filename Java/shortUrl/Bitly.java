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
	private final String ACCESS_TOKEN = "c5cabc578dd08bdaa49da8e37698667ff5c0f41e";
	private JsonElement jse;
	
	public Bitly(String userURL)
	{
		jse = null;

		try
		{
			// Encode given URL -- could throw UnsupportedEncodingException
			String encodedURL = URLEncoder.encode(userURL, "utf-8");

			// Construct Bitly API URL
			URL bitlyURL = new URL("https://api-ssl.bitly.com/v3/shorten?"
					+ "access_token=" + ACCESS_TOKEN + "&"
					+ "longURL=" + encodedURL);

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
			//System.out.println(jse.toString());


		}
	}
	
	public String getShortURL()
	{
		// Extract shortened URL from JSON string.
		// { "data": { ... "url" : "http://bit.ly/AbCdEF" ... } }
		String shortURL = jse.getAsJsonObject().get("data")
		                     .getAsJsonObject().get("url").getAsString();
		return shortURL;
	}
	
	public String getHash()
	{
		return jse.getAsJsonObject().get("data")
                .getAsJsonObject().get("hash").getAsString();
	}

	public static void main(String[] args)
	{
		Bitly b = new Bitly(args[0]);

		String shortened = b.getShortURL();
		//System.out.println(shortened);
		//System.out.println(b.getHash());
	}
}