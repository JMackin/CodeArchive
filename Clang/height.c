#include <stdio.h>
main()
{
  int ft, in, cm;
  printf ("Enter your height in feet and inches\n");
  printf ("\nFeet: ");
  scanf ("%d",&ft);
  printf ("\nInches:");
  scanf ("%d",&in);

  cm = (ft * 30) + (in * 2);

  printf ("\nYour height is %d in cm\n", cm);
}
