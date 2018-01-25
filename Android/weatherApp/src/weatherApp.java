import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class weatherApp extends Program
{
    private JTextField zip, city, temperature, weather, wind;
    private JLabel zipLabel, cityLabel, tempeLabel, weathLabel, windLabel;
    private JButton goButton;
    private Bitly bit;

    public void weatherApp()
    {
        start();
        setSize(400, 200);
        setBackground(Color.BLACK);
    }

    public void init()
    {
        TableLayout table = new TableLayout(6, 2);
        setLayout(table);

        zip = new JTextField();
        city = new JTextField();
        temperature = new JTextField();
        weather = new JTextField();
        wind = new JTextField();

        city.setEditable(false);
        temperature.setEditable(false);
        weather.setEditable(false);
        wind.setEditable(false);

        Dimension d = zip.getPreferredSize();
        d.setSize(200, d.getHeight());
        zip.setPreferredSize(d);

        zipLabel = new JLabel("<html><b>Enter Zip</b></html>");
        zipLabel.setForeground(Color.BLACK);
        cityLabel = new JLabel("<html><b>City</b></html>");
        cityLabel.setForeground(Color.BLACK);
        tempeLabel = new JLabel("<html><b>Temp</b></html>");
        tempeLabel.setForeground(Color.BLACK);
        weathLabel = new JLabel("<html><b>Weather</b></html>");
        weathLabel.setForeground(Color.BLACK);
        windLabel = new JLabel("<html><b>Wind Speed</b></html>");
        windLabel.setForeground(Color.BLACK);

        goButton = new JButton("Go!");
        goButton.setActionCommand("Go!");

        add(zipLabel);
        add(zip);
        add(cityLabel);
        add(city);
        add(tempeLabel);
        add(temperature);
        add(weathLabel);
        add(weather);
        add(windLabel);
        add(wind);
        add(goButton);

        addActionListeners();
    }

    public void actionPerformed(ActionEvent ae)
    {
        String zipString = ""; // Change this line
        String cityString;

        String what = ae.getActionCommand();
        if (what.equals("Go!"))
        {
            cityString = zip.getText();
            bit = new Bitly(cityString);
            city.setText(bit.getCity());
            temperature.setText(bit.getTemperature());
            weather.setText(bit.getWeather());
            wind.setText(bit.getWind());
        }
    }
    
}