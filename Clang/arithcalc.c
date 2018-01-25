#include <stdio.h>

main()
{
  int x,y,z;

  do{
    printf("Enter two numbers and a code for an operation to be performed\n");
    printf("1: addition, 2: subtraction, 3: multiplication, 4: division, 0: quit\n");
    scanf("%d",&x);
    scanf("%d",&y);
    scanf("%d",&z);

    switch(z){

      case 1:
      printf("Operation =%d\n", x + y);
      break;

      case 2:
      if( x > y ){
        printf("Operation =%d\n",x - y);
      }else{
        printf("Operation =%d\n",y - x);
      }
      break;

      case 3:
      printf("Operation =%d\n", x * y);
      break;

      case 4:
      if ( y == 0){
        printf("Divide by zero error");
        break;
      }
      printf("Operation =%d\n",x / y);
      break;

      case 0:
      break;

      default:
      printf("INVALID\n");
      break;

    }

  }while (z !=0);

}
