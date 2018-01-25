/*
 * Time.h
 *
 *  Created on: Jan 1, 2014
 *      Author: williamhooper
 */

#ifndef TIME_H_
#define TIME_H_

#include <iostream>
#include <string>
/**
 * Time class
 *
 * The Time class contains time as hours:minutes:seconds:milliseconds (AM/PM).
 */
class Time
{
public:
	/**
	 * Constructor with zero values
	 */
    Time();

    /**
     * Constructors with arguments
     */
    Time(long time);
    Time(int hours, int minutes, int seconds, int milli);

    /**
     * Deconstructor
     */
    virtual ~Time();

    /**
     * Return time as a long value representing time in milliseconds
     */
    long asLong() const;

    /**
     * Display as a string in the format hours:minutes:seconds:milliseconds.
     * For example 1:45:30:56 PM
     *
     * The time is displayed as 24 hours if the 24 hour flag is set true.
     */
    std::string toString() const;

    /**
     * Enable/disable 24 hour time display
     */
    void set24Hour(bool value);

    /**
     * Return true if 24 hour time display is enabled
     */
    bool is24Hour() const;

private:
    long time;
    int hours, minutes, seconds, milli;
    bool value;


};

#endif /* TIME_H_ */
