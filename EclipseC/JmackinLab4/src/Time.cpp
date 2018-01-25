
//============================================================================
// Name        : JmackinLab4.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <sstream>
#include "Time.h"

bool pm = false;
bool mt	= true;

Time::Time()
	:hours{0},minutes{0},seconds{0},milli{0},value{true},time{0}
{}
Time::~Time(){}
Time::Time(long t)
	:hours{0},minutes{0},seconds{0},milli{0},value{true},time{t}{

}
Time::Time(int h, int m, int s, int mi)
	:hours{h},minutes{m},seconds{s},milli{m},value{true},time{0}
{
	set24Hour(true);
}

long Time::asLong() const{
	long time = milli;
	time += seconds * 1000;
	time += minutes * 60000;
	time += hours * 3600000;

	return time;
}

std::string Time::toString() const{
	std::ostringstream ss;
	ss << hours << ":" << minutes << ":" << seconds << ":" << milli;
	if (!is24Hour()){
		if(pm == true){ ss << " " << "PM" << std::endl;}
		else{ ss << " " << "AM" << std::endl;}
	}
	else{ ss << std::endl;}
	std::string st = ss.str();
	return st;
}

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

bool Time::is24Hour() const{
	if (mt == true){
		return true;
	}else{
		return false;
	}
}
