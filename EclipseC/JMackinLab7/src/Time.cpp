
//============================================================================
// Name        : JmackinLab7
// Author      : John Mackin
// Version     :
// Description : Exceptions
//============================================================================

#include <iostream>
#include <string>
#include <sstream>
#include <exception>
#include "Time.h"

bool pm = false;
bool mt	= true;

//Invalid time value exception
//
class timeException: public std::exception
{
	virtual const char* what() const throw()
	{
		return "Time value out of range";
	}

} timeex;

//Time empty constructor
//
Time::Time()
	:hours{0},minutes{0},seconds{0},milli{0},value{true},time{0}
{
}

//Time abstract constructor
//
Time::~Time(){}

//Time long format constructor
//
Time::Time(long t)
	:hours{0},minutes{0},seconds{0},milli{0},value{true},time{t}
{
	if(t > 86400000 || t < 0){
		throw timeex;
	}

}

//Time full constructor
//
Time::Time(int h, int m, int s, int mi)
	:hours{h},minutes{m},seconds{s},milli{m},value{true},time{}
{
	if (h > 24 || h < 0){
		throw timeex;
	}else if(m >= 60 || m < 0){
		throw timeex;
	}else if(s >= 60 || s < 0){
		throw timeex;
	}else if(m >= 1000 || m < 0){
		throw timeex;
	}else{
		set24Hour(true);
	}

}

//Time copy constructor
//
Time::Time(const Time &t)
{
	hours = t.hours;
	minutes = t.minutes;
	seconds = t.seconds;
	milli = t.milli;
}

//Time copy assignment
//
Time& Time::operator=( const Time& rhs )
{
	this -> hours = rhs.hours;
	this -> minutes = rhs.minutes;
	this -> seconds = rhs.seconds;
	this -> milli = rhs.milli;

	return *this;
}

//returns time in long format
//
long Time::asLong() const{
	long time = milli;
	time += seconds * 1000;
	time += minutes * 60000;
	time += hours * 3600000;

	return time;
}

//Returns time object as string
//
std::string Time::toString() const{
	std::ostringstream ss;
	ss << hours << ":" << minutes << ":" << seconds << ":" << milli;
	if (!is24Hour()){
		if(pm == true){ ss << " " << "PM" << "\n";}
		else{ ss << " " << "AM" << "\n";}
	}
	else{ ss << "\n";}
	std::string st = ss.str(); //Weird string error. Still compiles
	return st;
}

//If Time t is in 24 hour format, checks mt flag as true
//
void Time::set24Hour(bool bl)
{
	if (bl == false){
		if (hours > 12 && hours < 24){
			hours -= 12;
			pm = true;
		}
		else if(hours == 12){
			pm = true;
		}
		mt = false;
	}
	else{
		if (mt == false){
			if(pm == true){
				hours += 12;
			}
		mt = true;
		}
	}
}

//Returns true if Time t is in 24-hour format
//
bool Time::is24Hour() const
{
	if (mt == true){
		return true;
	}else{
		return false;
	}
}

//returns Time t as output stream overload
//
std::ostream& operator <<(std::ostream& os, const Time& t)
{
	os << t.toString() << std::endl;

	return os;
}

//Less than comparison overload
//
bool operator<(const Time& a, const Time& b){

	bool result = a.asLong() < b.asLong();
	return result;
}

//Greater than comparison overload
//
bool operator>(const Time& a, const Time& b){

	bool result = a.asLong() > b.asLong();
		return result;
}

//Is-equal comparison overload
//
bool operator==(const Time &a, const Time &b){

	bool result = a.asLong() == b.asLong();
	return result;
}

//Adds two time objects overload
//
Time Time::operator+(const Time &t) const
{
	Time time;

	time.hours = this->hours + t.hours;
	time.minutes = this->minutes + t.minutes;
	time.seconds = this->seconds + t.seconds;
	time.milli = this->milli + t.milli;

	return time;
}

//Subtract one time object from another overload
//
Time Time::operator-(const Time &t) const
{
	Time time;

	time.hours = this->hours - t.hours;
	time.minutes = this->minutes - t.minutes;
	time.seconds = this->seconds - t.seconds;
	time.milli = this->milli - t.milli;

	return time;
}

//Getters
//
int Time::getHours() const
{
	return this -> hours;
}

int Time::getMinutes() const
{
	return this -> minutes;
}

int Time::getSeconds() const
{
	return this -> seconds;
}

int Time::getMilli() const
{
	return this -> milli;
}

//Setters
//
void Time::setHours(int t){
	if(t >= 24 || t < 0){
		throw timeex;
	}else{
		this -> hours = t;
	}
}

void Time::setMinutes(int t){
	if(t >= 60 || t < 0){
		throw timeex;
	}else{
		this -> minutes = t;
	}
}

void Time::setSeconds(int t){
	if(t >= 60 || t < 0){
		throw timeex;
	}else{
		this -> seconds = t;
	}
}

void Time::setMilli(int t){
	if(t >= 1000 || t < 0){
		throw timeex;
	}else{
		this -> milli = t;
	}
}
