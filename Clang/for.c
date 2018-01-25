#include <stdio.h>

main(){

  int x, i;
  printf("Enter a value to count down from \n");
  scanf("%d", &x);

  for (i = x; i > 0; i--){
    x--;
    printf("%d\n",x);
  }
}
