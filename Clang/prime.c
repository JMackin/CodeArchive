#include <stdio.h>
main()
{
  int x,i;
  int y = 1;
  printf("Enter a number:\n");
  scanf("%d",&x);
  if ( x % 2 != 0){
    for(i = x-1; i > 2; i--){
      if( x % i == 0){
        y = 0;
      }
    }
  }else{
    y = 0;
  }
  if (y == 1){
    printf("Entered number is prime\n");
  }else{
    printf("Entered number is not prime\n");
  }
}
