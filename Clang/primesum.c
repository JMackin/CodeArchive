#include <stdio.h>
main()
{
  int x,i,j,y;
  int z = 0;
  printf("Enter a number:\n");
  scanf("%d",&x);
  for (j = x -1; j > 0; j--){
  if ( j % 2 != 0){
    for(i = j-1; i > 2; i--){
      if( j % i == 0){
        y = 0;
      }
      else{
        y = 1;
      }
    }
  }else{
    y = 0;
  }
  if (y == 1){
    z += j;
  }
  }
  printf("sum of all prime numbers below %d is %d\n",x,z);
}
