/**
 * Created by Caitlyn Towne on 11/4/2015.
 */
import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RadarGUI extends Program {
    private JLabel map, titleLabel, locationLabel;
    private JButton radarButton, satelliteButton, radarsatelliteButton;
    public String zipcodeString;

    public RadarGUI(String zipcode) {
        start();
        setSize(450, 450);
        setBackground(Color.GRAY);
        zipcodeString = zipcode;
    }

    public void init() {
        TableLayout table = new TableLayout(6, 1);
        setLayout(table);

        GetWeather receiveradar = new GetWeather();
        map = new JLabel();
        map.setIcon(receiveradar.getImage(zipcodeString, "radar"));
        radarButton = new JButton("Radar");
        radarButton.setActionCommand("Radar");
        satelliteButton = new JButton("Satellite");
        satelliteButton.setActionCommand("Satellite");
        radarsatelliteButton = new JButton("Radar + Satellite");
        radarsatelliteButton.setActionCommand("Radar + Satellite");

        titleLabel = new JLabel("MAP");
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 12));
        titleLabel.setForeground(Color.BLACK);

        String city = receiveradar.getCity();
        locationLabel = new JLabel("" + city);
        locationLabel.setVerticalAlignment(SwingConstants.CENTER);
        locationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        locationLabel.setFont(new Font("Arial", Font.BOLD, 12));
        locationLabel.setForeground(Color.BLACK);

        add(titleLabel);
        add(locationLabel);
        add(map);
        add(radarButton);
        add(satelliteButton);
        add(radarsatelliteButton);

        addActionListeners();
    }

    public void actionPerformed(ActionEvent ae) {
        String what = ae.getActionCommand();
        if (what.equals("Radar")) {
            GetWeather receiveradar = new GetWeather();
            map.setIcon(receiveradar.getImage(zipcodeString, "radar"));
        }
        if (what.equals("Satellite")) {
            GetWeather receiveradar = new GetWeather();
            map.setIcon(receiveradar.getImage(zipcodeString, "satellite"));
        }
        if (what.equals("Radar + Satellite")) {
            GetWeather receiveradar = new GetWeather();
            map.setIcon(receiveradar.getImage(zipcodeString, "radar/satellite"));
        }
    }

    public static void main(String[] args) {
        RadarGUI radargui = new RadarGUI(args[0]);
    }
}