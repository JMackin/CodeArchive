#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

  int array[21],y, z = 20, t = 0,  x, n, count = 0;
  srand(time(NULL));
  array[21] = 0;
  for(x =0; x < 20; x++){
    array[x] = x;
    count++;
  }

  while(t != 1){
    n = rand() % z;
    array[n] = -1;
    for(x =0; x < z; x++){
      if(array[x] == -1){
       for(y =0; y + 1 != 0; y++){
        array[y] = array[y + 1];
        }
      }
     }
    z = z -1;
   }
  

}
