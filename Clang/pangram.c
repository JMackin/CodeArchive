#include <stdio.h>
#include <string.h>
main(){
int i = 0, c, x = 0;
int alph[26] = {0};
char word[50];
printf("Enter a word...\n");
scanf("%s",word);

while(word[i] != '\0'){
  c = word[i];
  if (c > 64 && c < 91){
    c = c % 65;
    alph[c] += 1;
  }else if(c > 96 && c < 123){
    c = c % 97;
    alph[c]++;
  }
  i++;
}

for (i = 0; i < 26 ; i++){
  if (alph[i] == 0){
    x = 0;
    break;
  }else
  x += alph[i];
}

if ( x == 26){
  printf("It's a perfect pangram\n");
}else if( x == 0){
  printf("It's not a pangram\n");
}else{
  printf("It's a pangram\n");
}

} //end main
