//============================================================================
// Name        : JmackinLab4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <sstream>
#include <string>
#include "Time.h"

int main() {

	Time t = Time(9,30,20,10);
	std::cout << t.toString();

	std::ostringstream ss;
	ss << t.asLong() << std::endl;
	std::cout << ss.str();

	t.set24Hour(false);
	std::cout << t.toString() << std::endl;

	t.set24Hour(true);
	std::cout << t.toString() << std::endl;


	return 0;
}
