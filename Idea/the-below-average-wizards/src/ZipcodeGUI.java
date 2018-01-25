import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ZipcodeGUI extends Program
{
    private ImageIcon weatherIcon;
    private JTextField zipCode;
    private JLabel weatherLabel, temperature, zipLabel, labelIcon, currentWeather, date;
    private JButton forecastButton, mapButton, goButton;
    private GetWeather weather;
    private IPtoZIP iPtoZIP;
    private String clientZipCode;

    public ZipcodeGUI()
    {
        start();
        setSize(400, 250);
        setBackground(Color.GRAY);
        setJMenuBar(null);



    }


    public void init()
    {

        //Get the client's zipcode:
        //iPtoZIP = new IPtoZIP();
        //clientZipCode = iPtoZIP.getZip();

        checkZipCode();

        //Set up GetWeather()
        //
        System.out.println(clientZipCode);
        weather = new GetWeather();
        weather.getJson((clientZipCode));



        TableLayout table = new TableLayout(6, 3, 8 , 8);
        setLayout(table);

        //SetUpTextFields
        zipCode = new JTextField();
        zipCode.setText(clientZipCode);

        //setup ZipCode box size
        Dimension d = zipCode.getPreferredSize();
        d.setSize(120, d.getHeight());
        zipCode.setPreferredSize(d);


        //SetUP Labels
        weatherLabel = new JLabel("WEATHER");
        weatherLabel.setVerticalAlignment(SwingConstants.CENTER);
        weatherLabel.setHorizontalAlignment(SwingConstants.CENTER);
        weatherLabel.setFont(new Font("Arial", Font.BOLD, 24));
        weatherLabel.setForeground(Color.BLACK);

        zipLabel = new JLabel("<HTML><b>Zip:</b></html>");
        weatherLabel.setForeground(Color.BLACK);



        temperature = new JLabel("<html>" + weather.getCurrentTemperature() + "&deg;</html>");
        temperature.setVerticalAlignment(SwingConstants.CENTER);
        temperature.setHorizontalAlignment(SwingConstants.CENTER);
        temperature.setFont(new Font("Arial",Font.BOLD, 24));
        temperature.setForeground(Color.BLACK);

        Dimension d2 = temperature.getPreferredSize();
        d2.setSize(120, d.getHeight());
        temperature.setPreferredSize(d2);

        currentWeather = new JLabel(weather.getCurrentWeather());
        currentWeather.setHorizontalAlignment(SwingConstants.CENTER);
        currentWeather.setVerticalAlignment(SwingConstants.CENTER);
        currentWeather.setFont(new Font("Arial", Font.BOLD, 12));
        currentWeather.setForeground(Color.BLACK);


        //SetUpButtons
        forecastButton = new JButton("Forecast");
        forecastButton.setActionCommand("Forecast");
        mapButton = new JButton("Map");
        mapButton.setActionCommand("Map");
        goButton = new JButton("Change Zip");
        goButton.setActionCommand("ChangeZip");

        //setUPIcon
        weatherIcon = weather.getCurrentWeatherIcon();
        labelIcon = new JLabel(weatherIcon);

        //Set up date
        date = new JLabel();



        //Add items
        add(weatherLabel, "gridwidth=REMAINDER");
        add(zipLabel);
        add(zipCode);
        add(temperature);
        add(goButton, "gridwidth=2");
        add(labelIcon, "gridheight=2");
        add(mapButton, "gridwidth=2");
        add(forecastButton, "gridwidth=2");
        add(currentWeather);

        //add(mapButton, "gridheight=2 gridwidth=2");



        addActionListeners();
    }

    private void checkZipCode(){

        //Get the client's zipcode:
        iPtoZIP = new IPtoZIP();

        if(iPtoZIP.getZip() != null || iPtoZIP.getZip().equals("")){
            clientZipCode = iPtoZIP.getZip();
        } else {
            clientZipCode = "95677";
        }

    }

    private void updateWeather(){
        labelIcon = new JLabel(weather.getCurrentWeatherIcon());
        currentWeather.setText(weather.getCurrentWeather());
        temperature.setText("<html>" + weather.getCurrentTemperature() + "&deg;</html>");
    }

    public void actionPerformed(ActionEvent ae)
    {

        SevenDayForecast sevenDayForecast;
        RadarGUI radar;

        String zipcode;

        String what = ae.getActionCommand();
        if (what.equals("Forecast"))
        {
            zipcode = zipCode.getText();
            sevenDayForecast = new SevenDayForecast(zipcode);

        }
        else if (what.equals("Map"))
        {
            zipcode = zipCode.getText();
            radar = new RadarGUI(zipcode);

        } else if(what.equals("ChangeZip")){
            zipcode = zipCode.getText();
            weather.getJson((zipcode));
            updateWeather();

        }
    }


    public static void main(String[] args){

        new ZipcodeGUI();
        //IPtoZIP test = new IPtoZIP();
        //System.out.println(test.getZip());

    }
}