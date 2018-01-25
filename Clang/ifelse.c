#include <stdio.h>
int main()
{
  int x, y;
  printf("Enter a number x\n");
  scanf("%d",&x);
  printf("\nEnter another number y\n");
  scanf("%d", &y);

  if ( x == y) {
      printf("\nx equals y\n");
  } else if (x > y) {
      printf("\nx is greater than y\n");
  } else if (y > x) {
      printf("\nx is less than y\n");
  }

}
