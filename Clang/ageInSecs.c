#include <stdio.h>

main()
{
long long age;
printf ("Enter your age: ");
scanf ("%lld", &age);
age = (age * 365) * 86400;
printf ("\nyour age is %lld in seconds\n", age);
}
