import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class TenDayForecast extends Program
{
    private JTextField city, enterZip, weather, temperature, windspeed;
    private JLabel title, day1, day2, day3, day4, day5, day6, day7, day8, day9, day10,
            date1, date2, date3, date4, date5, date6, date7, date8, date9, date10,
            temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10,
            wind1, wind2, wind3, wind4, wind5, wind6, wind7, wind8, wind9, wind10,
            iconLabel;
    private JButton goButton, clearButton;
    String zipcode, info;

    public TenDayForecast(String zipcode)
    {
        start();
        setSize(800, 600);
        setBackground(Color.GRAY);
    }

    public void init()
    {
        TableLayout table = new TableLayout(6, 10);
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
        /*ImageIcon qwert = ImageIcon("picture");
        iconLabel = new JLabel("images/picture.png")
        /*cityLabel = new JLabel("<html><b>City</b></html>");
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
        */
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



/*
import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class TenDayForecast extends Program
{
    private JTextField city, enterZip, weather, temperature, windspeed;
    private JLabel title, day1, day2, day3, day4, day5, day6, day7, day8, day9, day10,
            date1, date2, date3, date4, date5, date6, date7, date8, date9, date10,
            temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10,
            wind1, wind2, wind3, wind4, wind5, wind6, wind7, wind8, wind9, wind10,
            iconLabel;
    private JButton goButton, clearButton;
    String zipcode, info;

    public TenDayForecast()
    {
        start();
        setSize(800, 600);
        setBackground(Color.GRAY);
    }

    public void init()
    {
        TableLayout table = new TableLayout(6, 10);
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
        ImageIcon qwert = new ImageIcon("picture.png");
        iconLabel = new JLabel(qwert);
        /*cityLabel = new JLabel("<html><b>City</b></html>");
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

add(iconLabel);

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
 */
