//============================================================================
// Name        : JmackinLab5.cpp
// Author      :
// Version     :
// Description : Operator Overloading
//============================================================================

#include <iostream>
#include <sstream>
#include <string>
#include "Time.h"

int main() {

	Time t = Time(9,30,20,10);
	Time t2 = Time(1,20,10,5);
	Time t3;
	std::cout << t.toString();

	std::ostringstream ss;
	ss << t.asLong() << "\n";
	std::cout << ss.str();

	t.set24Hour(false);
	std::cout << t.toString();

	t.set24Hour(true);

	//Out stream op overload test
	std::cout << t;

	//Addition op overload test
	t3 = t + t2;
	std::cout << t3;

	//Subtraction op overload test
	t3 = t - t2;
	std::cout << t3;

	//Less-than op overload test.
	bool res = t < t3;
	std::cout << res << std::endl;

	//Greater-than op overload test.
	res = t > t3;
	std::cout << res << std::endl;

	//Equal-to op overload test.
	res = t == t2;
	std::cout << res << std::endl;


	return 0;
}
