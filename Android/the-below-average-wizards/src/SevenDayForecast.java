/* Created By Nick Huiting. Updated 11/8/15*/

import acm.program.*;
import acm.gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SevenDayForecast extends Program {
    private JLabel title, day1, day2, day3, day4, day5, day6, day7,
            date1, date2, date3, date4, date5, date6, date7,
            htemp1, htemp2, htemp3, htemp4, htemp5, htemp6, htemp7,
            ltemp1, ltemp2, ltemp3, ltemp4, ltemp5, ltemp6, ltemp7,
            wind1, wind2, wind3, wind4, wind5, wind6, wind7,
            icon1, icon2, icon3, icon4, icon5, icon6, icon7,
            ltempLabel, htempLabel, windLabel, spacer, dayLabel, dateLabel;
    private JButton radarButton, mainButton;
    private ImageIcon img1, img2, img3, img4, img5, img6, img7;
    String zipcode;
    String zipDbl;

    public SevenDayForecast(String zip) {
        zipDbl = (zip);
        zipcode = zip;
        start();
        setSize(700, 400);
        setBackground(Color.GRAY);
    }

    public void init() {
        GetWeather info = new GetWeather();
        info.getJson(zipDbl);

        TableLayout table = new TableLayout(7, 8);
        setLayout(table);

        String s = "";
        String city = info.getCity();

        title = new JLabel("<html><b><font size=10>Seven Day Forecast for " + city + "</font size></b></html>");
        spacer = new JLabel(" ");
        dayLabel = new JLabel("<html><b><font size=4>Day    </font size></b></html>");
        dateLabel = new JLabel("<html><b><font size=4>Date    </font size></b></html>");
        windLabel = new JLabel("<html><b><font size=4>Wind    </font size></b></html>");

        day1 = new JLabel(info.getDayInputWeekday(0));
        day2 = new JLabel(info.getDayInputWeekday(1));
        day3 = new JLabel(info.getDayInputWeekday(2));
        day4 = new JLabel(info.getDayInputWeekday(3));
        day5 = new JLabel(info.getDayInputWeekday(4));
        day6 = new JLabel(info.getDayInputWeekday(5));
        day7 = new JLabel(info.getDayInputWeekday(6));

        date1 = new JLabel(info.getDayInputMonth(0) + " " + info.getDayInputDayOfMonth(0) + "     ");
        date2 = new JLabel(info.getDayInputMonth(1) + " " + info.getDayInputDayOfMonth(1) + "     ");
        date3 = new JLabel(info.getDayInputMonth(2) + " " + info.getDayInputDayOfMonth(2) + "     ");
        date4 = new JLabel(info.getDayInputMonth(3) + " " + info.getDayInputDayOfMonth(3) + "     ");
        date5 = new JLabel(info.getDayInputMonth(4) + " " + info.getDayInputDayOfMonth(4) + "     ");
        date6 = new JLabel(info.getDayInputMonth(5) + " " + info.getDayInputDayOfMonth(5) + "     ");
        date7 = new JLabel(info.getDayInputMonth(6) + " " + info.getDayInputDayOfMonth(6) + "     ");

        img1 = info.getCurrentWeatherIcon();
        img2 = info.getDay2WeatherIcon();
        img3 = info.getDay3WeatherIcon();
        img4 = info.getDay4WeatherIcon();
        img5 = info.getDay5WeatherIcon();
        img6 = info.getDay6WeatherIcon();
        img7 = info.getDay7WeatherIcon();

        icon1 = new JLabel(img1);
        icon2 = new JLabel(img2);
        icon3 = new JLabel(img3);
        icon4 = new JLabel(img4);
        icon5 = new JLabel(img5);
        icon6 = new JLabel(img6);
        icon7 = new JLabel(img7);

        htempLabel = new JLabel("<html><b><font size=4>High    </font size></b></html>");
        htemp1 = new JLabel(s + info.getDay1High() + "F");
        htemp2 = new JLabel(s + info.getDay2High() + "F");
        htemp3 = new JLabel(s + info.getDay3High() + "F");
        htemp4 = new JLabel(s + info.getDay4High() + "F");
        htemp5 = new JLabel(s + info.getDay5High() + "F");
        htemp6 = new JLabel(s + info.getDay6High() + "F");
        htemp7 = new JLabel(s + info.getDay7High() + "F");

        ltempLabel = new JLabel("<html><b><font size=4>Low    </font size></b></html>");
        ltemp1 = new JLabel(s + info.getDay1Low() + "F");
        ltemp2 = new JLabel(s + info.getDay2Low() + "F");
        ltemp3 = new JLabel(s + info.getDay3Low() + "F");
        ltemp4 = new JLabel(s + info.getDay4Low() + "F");
        ltemp5 = new JLabel(s + info.getDay5Low() + "F");
        ltemp6 = new JLabel(s + info.getDay6Low() + "F");
        ltemp7 = new JLabel(s + info.getDay7Low() + "F");

        wind1 = new JLabel(s + info.getDay1WindSpeed() + "mph");
        wind2 = new JLabel(s + info.getDay2WindSpeed() + "mph");
        wind3 = new JLabel(s + info.getDay3WindSpeed() + "mph");
        wind4 = new JLabel(s + info.getDay4WindSpeed() + "mph");
        wind5 = new JLabel(s + info.getDay5WindSpeed() + "mph");
        wind6 = new JLabel(s + info.getDay6WindSpeed() + "mph");
        wind7 = new JLabel(s + info.getDay7WindSpeed() + "mph");


        radarButton = new JButton("\n                   Radar                   ");
        radarButton.setActionCommand("Radar");
        mainButton = new JButton("\n                   Return                   ");
        mainButton.setActionCommand("Return");

        //row 1
        add(title, NORTH);


        //row 2
        add(dayLabel);
        add(day1);
        add(day2);
        add(day3);
        add(day4);
        add(day5);
        add(day6);
        add(day7);

        //row 3
        add(dateLabel);
        add(date1);
        add(date2);
        add(date3);
        add(date4);
        add(date5);
        add(date6);
        add(date7);

        //row 4
        add(htempLabel);
        add(htemp1);
        add(htemp2);
        add(htemp3);
        add(htemp4);
        add(htemp5);
        add(htemp6);
        add(htemp7);

        //row 5
        add(spacer);
        add(icon1);
        add(icon2);
        add(icon3);
        add(icon4);
        add(icon5);
        add(icon6);
        add(icon7);

        //row 6
        add(ltempLabel);
        add(ltemp1);
        add(ltemp2);
        add(ltemp3);
        add(ltemp4);
        add(ltemp5);
        add(ltemp6);
        add(ltemp7);

        //row 7
        add(windLabel);
        add(wind1);
        add(wind2);
        add(wind3);
        add(wind4);
        add(wind5);
        add(wind6);
        add(wind7);

        //row 8
        //
        add(radarButton, SOUTH);
        add(mainButton, SOUTH);


        addActionListeners();
    }

    public void actionPerformed(ActionEvent ae) {

        String what = ae.getActionCommand();

        if (what.equals("Return")) {
            new ZipcodeGUI();
        }
        else if (what.equals("Radar")) {
            new RadarGUI(zipcode);
        }
    }
}
