#include <stdio.h>

main()
{
  int x,y;
  srand(time(NULL));
  printf("Do you want to play? Enter 1 for yes, or any other number to quit...\n");
  scanf("%d",&x);
  if (x == 1){
    while ( x== 1){
      printf("Enter a number between 1 and 999\n");
      scanf("%d",&x);
      y = rand() % 1000 ;
      if (x != y){
        printf("You entered:%d Computer picked:%d\n",x,y);
        printf("Do you want to play? Enter 1 for yes, or any other number to quit...\n");
        scanf("%d",&x);
      }else{
        printf("You win! You entered:%d Computer picked:%d\n",x,y);
      }//end if-else
    }//end while
  }//end if
}
