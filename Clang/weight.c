#include <stdio.h>

main()
{
float weight;
printf ("Enter your exact weight in lbs\n");
scanf ("%f", &weight);

weight = weight * 0.453592;

printf ("\nYour weight is %f in kgs\n", weight);

}
