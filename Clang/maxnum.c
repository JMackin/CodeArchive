#include <stdio.h>

main()
{
  int x;
  int max = 0;
  printf("Please enter a number: ");

  while(x != 0){
    scanf("%d", &x);
  if (x > max){
    max = x;
  }
  printf("Current max is %d\n", max);
  printf("Enter another number or 0 to quit\n");
  }

}
