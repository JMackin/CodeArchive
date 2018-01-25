//============================================================================
// Name        : JmackinLab7
// Author      : John Mackin
// Version     :
// Description : Exceptions
//============================================================================


#ifndef TIME_H_
#define TIME_H_

#include <iostream>
#include <string>

/**
 * Time class
 *
 * The Time class contains time as hours:minutes:seconds:milliseconds
 */
class Time
{
public:
    Time();
    Time(long time);
    Time(int hours, int minutes, int seconds, int milli);
    virtual ~Time();

    /**
     * Return time as a long
     */
    long asLong() const;

    /**
     * Display as a string in the format hours:minutes:seconds:milliseconds
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

    /**
     * Output the time to an output stream as hours:minutes:seconds:milliseconds
     */
    friend std::ostream& operator <<(std::ostream&, const Time&); // Output a Time to an output stream

    /**
     * Define ordering relationships
     */
    friend bool operator <(const Time&, const Time&);
    friend bool operator >(const Time&, const Time&);
    friend bool operator ==(const Time &a, const Time &b);

    /**
     * Define addition and subtraction
     */
    Time operator +(const Time&) const;
    Time operator -(const Time&) const;

    /**
     * Copy constructor
     */
   Time(const Time & t);

    /**
     * Copy assignment
     */
   Time& operator=( const Time& rhs );

   /**
    * Getters
    */
   int getHours() const;
   int getMinutes() const;
   int getSeconds() const;
   int getMilli() const;

   /**
    * Setters
    */
   void setHours(int t);
   void setMinutes(int t);
   void setSeconds(int t);
   void setMilli(int t);

private:
    /**
     * Private members go here
     */
    long time;
    int hours, minutes, seconds, milli;
    bool value;
};

#endif /* TIME_H_ */
