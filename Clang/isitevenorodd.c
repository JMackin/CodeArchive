#include <stdio.h>

main()
{
  int x, y;
  printf("Enter number to determine if it's even or odd\n");
  printf("Enter 0 to quit\n");

  while (x != 0){
    scanf("%d",&x);
    if ( (x % 2 == 0) && (x != 0) ){
      printf("The number you entered is even\n");
      printf("Enter a number\n");
    }else if (x % 2 != 0) {
      printf("The number you entered is odd\n");
      printf("Enter a number\n");
    }else if ( x == 0){
      printf("Bye");
    }
  }

}
