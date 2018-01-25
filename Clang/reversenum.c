#include <stdio.h>

main()
{
  int x, y = 0;
  printf("Enter a number to be reversed\n");
  scanf("%d",&x);
  while (x != 0){
    y = y * 10;
    y = y + x % 10;
    x = x / 10;
  }
  printf("the number in reverse is %d\n", y);
}
