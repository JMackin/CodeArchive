#include <stdio.h>

main(){

  int x;
  printf("Enter a number between 1-10\n");
  scanf("%d", &x);

  switch(x)
  {
    case 1:
      printf("Number one\n");
      break;
    case 2:
      printf("Number two\n");
      break;
    case 3:
      printf("Number three\n");
      break;
    case 4:
      printf("Number four\n");
      break;
    case 5:
      printf("Number five\n");
      break;
    case 6:
      printf("Number six\n");
      break;
    case 7:
      printf("Number seven\n");
      break;
    case 8:
      printf("Number eight\n");
      break;
    case 9:
      printf("Number nine\n");
      break;
    case 10:
      printf("Number ten\n");
      break;
    default:
      printf("That's not between 1 and 10\n");
      break;
  }
}
