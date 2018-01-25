#include <stdio.h>

main()
{
  float l;
  int g;

  while (g != 0) {
    printf("Please enter number of gallons or 0 to quit:\n");
    scanf("%d",&g);
    if (g != 0){
      l = g * 3.78541;
      printf("%d gallons is %f liters\n", g, l);
    }else{
      printf("bye\n");
    }
  }
}
