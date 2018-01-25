#include <stdio.h>

main()
{
// Problem 1
  int numArray[10] = {3,9,1,2,10,19,13,8,6,11};
  int x, z, y = 0;
  for (x = 0; x < 10; x++){
    if (x % 2 != 0){
      y += numArray[x];
    }
  }
  printf("Problem 1: %d\n",y);

// Problem 2
  y = 0;
  z = numArray[0];
  for (x = 0; x < 10; x++){
    if( numArray[x] > y){
      y = numArray[x];
    }else if (numArray[x] < z){
      z = numArray[x];
    }
  }
  printf("\nProblem 2: Max=%d, Min=%d\n",y ,z);

//Problem 3
  printf("\nProblem 3:\n");
  for (x = 9; x >= 0; x--){
    if ( numArray[x] % 2 != 0 ){
       printf("Index: %d Value: %d\n", x, numArray[x]);
    }
  }

//Problem 4
  printf("\nProblem 4:\n");
  int mirrorArray[10] = {3, 9, 1, 12, 10, 19,13, 8, 6, 11};
  for (x = 0; x < 10; x++){
    printf("Index %d: numArray = %d  mirrorArray = %d\n",x, numArray[x], mirrorArray[x]);
    if(mirrorArray[x] != numArray[x]){
      break;
    }
  }

  printf("\n");

  for (x = 9; x >= 0; x--){
    printf("Index %d: numArray = %d  mirrorArray = %d\n",x, numArray[x], mirrorArray[x]);
    if(mirrorArray[x] != numArray[x]){
      break;
    }
  }

//Problem 5
  int k, i, j;
  int n = 10;
  int inputArray[10] = {71, 89, 23, 11, 33, 81, 48, 9, 68, 79};

  printf("\nProblem 5:\n");
  printf("Input: ");
  for (i = 0; i <= n-1; i++){
    printf("%d, ",inputArray[i]);
  }

  for (i = 0; i <= n-1; i++){
  for (j = 0; j <= n-2; j++){
    if( inputArray[j] > inputArray[j + 1]){
      k = inputArray[j];
      inputArray[j] = inputArray[j + 1];
      inputArray[j + 1] = k;
    }
  }
  }
  printf("\n");
  printf("Output: ");
  for (i = 0; i <= n-1; i++){
    printf("%d, ",inputArray[i]);
  }
  printf("\n");
}
