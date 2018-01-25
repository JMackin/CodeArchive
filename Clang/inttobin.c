#include <stdio.h>
#include <math.h>

main(){
  int i, x, y = 0;
  printf("Enter a number: ");
  scanf("%d",&x);

  for(i = 0; x != 0; i++){
    y = y + pow(10,i) * (x%2);
    x = x / 2;
  }

  printf("%d\n",y);
}
