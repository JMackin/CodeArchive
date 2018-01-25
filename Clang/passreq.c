#include <stdio.h>
#include <string.h>

main(){
int i, x, f, c = 0, d = 0, e = 0;
char pass[20];
printf("Enter your password...\n");

do{
f = 0;
scanf("%s",pass);


for(i = 0; i < strlen(pass); i++){
  x = pass[i];
  if( x > 64 && x < 91){
    d = 1;
  }
  if( x > 47 && x < 58){
    e = 1;
  }
  switch (x){
  case 38:c = 1;break;
  case 37:c = 1;break;
  case 33:c = 1;break;
  case 40:c = 1;break;
  case 41:c = 1;break;
  case 42:c = 1;break;
  case 43:c = 1;break;
  default:break;
  }
}

if(strlen(pass) < 6 || strlen(pass) > 32){
  printf("Doesnt meet length requirments\n");
  f = 1;
}
if (d != 1){
  printf("%d No caps\n",d);
  f = 1;
}
if (e != 1){
  printf("%d No nums\n",e);
  f = 1;
}
if (c != 1){
  printf("%d No syms\n",c);
  f = 1;
}

if (f == 1){
  printf("Re-enter your password\n");
}else{
  printf("Suitable password\n");
}

}while(f == 1);

}
