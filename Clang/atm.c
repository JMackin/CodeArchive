#include <stdio.h>

main()
{
  float y, balance = 100.0;
  int x;

  do{
  printf("1 for withdraw\n2 for deposit\n3 to print balance\n4 to quit\n>");
  scanf("%d", &x);

  switch(x){

    case 1:
      printf("Enter amount to withdraw\n>");
      scanf("%f",&y);
      if( y > balance) { printf("Insufficient funds\n"); break; }
      balance = balance - y;
      printf("New Balance: $%f\n", balance);
      break;
    break;

    case 2:
    printf("Enter amount to deposit\n>");
    scanf("%f",&y);
    balance = balance + y;
    printf("New Balance: $%f\n", balance);
    break;

    case 3:
    printf("Current Balance: $%f\n", balance);
    break;

    case 4:
    break;

    default:
    printf("Invalid option\n");
    break;
  }
  }while(x != 4);

}
