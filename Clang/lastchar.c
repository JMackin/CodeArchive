#include <stdio.h>
#include <string.h>

main(){
char word[20];
char ch, e;
int i =0, x;
printf("Enter a string\n");

while(e != '\n'){
scanf("%c",&e);
word[i] = e;
i++;
}

printf("now enter the letter to look for=  ");
scanf("%c",&ch);

for (i = 0; i < strlen(word); i++){
  if(word[i] == ch){
    x = i;
  }
}

printf("Your character last appears at index %d", x);

}
