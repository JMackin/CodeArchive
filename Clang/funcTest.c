#include <stdio.h>

int add(int x, int y)
{
  int result;
  result = x + y;
  return result;
}

int product(int x, int y){
  int result;
  result = x * y;
  return result;
}

void main(){
  int a = 10, b = 20, r;
  r = product(a,b);
  printf (" Product function = %d \n", r);
  r = add(a, b);
  printf ("Add funtion = %d \n", r);
}
