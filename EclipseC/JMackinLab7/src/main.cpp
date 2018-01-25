//============================================================================
// Name        : JmackinLab7
// Author      : John Mackin
// Version     :
// Description : Exceptions
//============================================================================

#include <iostream>
#include <sstream>
#include <string>
#include "Time.h"

int main() {

	Time t = Time(10,30,50,10);
	Time t2 = Time(7,14,51,29);
	Time t3;

	//set24hour, toString, and asLong test
	std::cout << t.toString();
	std::cout << t.asLong() << "\n";
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

	//Test copy constructor and copy assignment overload
	Time t4(t2);
	std::cout << t4;
	std::cout << t2;
	t4 = t;
	std::cout << t4;

	//Test accessors and mutators
	Time t5 = Time();
	std::cout << t5;
	t5.setHours(20);
	t5.setMinutes(15);
	t5.setSeconds(43);
	t5.setMilli(546);
	std::cout << t5;

	t5.set24Hour(false);
	std::cout << t5;
	t5.setMinutes(20);
	std::cout << t5.getHours() << " "
			  << t5.getMinutes() << " "
			  << t5.getSeconds() << " "
			  << t5.getMilli() << " ";

	return 0;
}
