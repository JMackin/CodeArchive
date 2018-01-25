import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class WeatherApp extends Program
{
    private JTextField city, enterZip, weather, temperature, windspeed;
    private JLabel cityLabel, zipLabel, weatherLabel, tempLabel, windLabel;
    private JButton goButton, clearButton;
    String zipcode, info;

    public WeatherApp()
    {
        start();
        setSize(450, 200);
        setBackground(Color.GREEN);
    }

    public void init()
    {
        TableLayout table = new TableLayout(6, 2);
        setLayout(table);

        city = new JTextField();
        enterZip = new JTextField();
        weather = new JTextField();
        temperature = new JTextField();
        windspeed = new JTextField();

        city.setEditable(false);
        weather.setEditable(false);
        temperature.setEditable(false);
        windspeed.setEditable(false);

        cityLabel = new JLabel("<html><b>City</b></html>");
        cityLabel.setForeground(Color.WHITE);
        zipLabel = new JLabel("<html><b>Enter ZIP</b></html>");
        zipLabel.setForeground(Color.WHITE);
        weatherLabel = new JLabel("<html><b>Weather</b></html>");
        weatherLabel.setForeground(Color.WHITE);
        tempLabel = new JLabel("<html><b>Temperature</b></html>");
        tempLabel.setForeground(Color.WHITE);
        windLabel = new JLabel("<html><b>Wind Speed</b></html>");
        windLabel.setForeground(Color.WHITE);

        goButton = new JButton("              Go!              ");
        goButton.setActionCommand("Go!");
        clearButton = new JButton("Clear");
        clearButton.setActionCommand("Clear");

        add(zipLabel);
        add(enterZip);

        add(cityLabel);
        add(city);

        add(weatherLabel);
        add(weather);

        add(tempLabel);
        add(temperature);

        add(windLabel);
        add(windspeed);

        add(clearButton);
        add(goButton);

        addActionListeners();
    }

    public void actionPerformed(ActionEvent ae)
    {

        String what = ae.getActionCommand();

        if (what.equals("Clear"))
        {
            city.setText("");
            enterZip.setText("");
            weather.setText("");
            temperature.setText("");
            windspeed.setText("");

        }
        else if (what.equals("Go!"))
        {
            if (!enterZip.getText().equals("")) {
                zipcode = enterZip.getText();
                getWeather app = new getWeather();
                info = app.acquireWeather(zipcode);
                String cityStr = app.getCity(info);
                String weatherStr = app.parseWeather(info);
                double temperatureStr = app.getTemperature(info);
                double windStr = app.getWindSpeed(info);
                city.setText(cityStr);
                weather.setText(weatherStr);
                temperature.setText("" + temperatureStr + " F");
                windspeed.setText("" + windStr + " mph");
            }
            else {
                city.setText("");
                enterZip.setText("");
                weather.setText("");
                temperature.setText("");
                windspeed.setText("");
            }
        }
    }
}