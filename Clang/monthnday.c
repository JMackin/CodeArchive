#include <stdio.h>

main(){
int i, j, x, y, z;
printf("Enter a number for the month and the day of the week that is the first day of that month seperated by a space\n");
scanf("%d%d",&x,&y);

if (x < 1 || x > 12){
  printf("Invalid month...\n");
}else if ( y < 1 || y > 7){
  printf("Invalid day...\n");
}else{

switch (x){
case 1:z = 31;break;
case 2:z = 28;break;
case 3:z = 31;break;
case 4:z = 30;break;
case 5:z = 31;break;
case 6:z = 30;break;
case 7:z = 31;break;
case 8:z = 31;break;
case 9:z = 30;break;
case 10:z = 31;break;
case 11:z = 30;break;
case 12:z = 30;break;
default:break;
}

y -= 1;
printf("  S  M  T  W  T  F  S\n");
for(i = 1; i <= y; i++){
  printf("   ");
}

for(i = 1; i <= z; i++){
  printf("%3d", i);
  y = (y + 1) % 7;
  if(y == 0){
    printf("\n");
  }
}

printf("\n");
}

}
