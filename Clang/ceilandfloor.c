#include <stdio.h>
#include <math.h>
main()
{
  double x;
  printf("Enter a number of type float\n");
  scanf("%lf",&x);
  printf("Floor:%f\n",floor(x));
  printf("Ceiling:%f\n",ceil(x));
}
