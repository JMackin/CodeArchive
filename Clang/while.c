#include <stdio.h>

main(){

  int x, y;
  printf("Enter value x \n");
  scanf("%d", &x);
  printf("Enter value y \n");
  scanf("%d", &y);

  int count = 0;
  while ( count < y) {
    x++;
    printf("%d\n", x);
    count++;
  }
  printf("x plus y = %d\n", x);

}
