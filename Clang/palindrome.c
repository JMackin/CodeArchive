#include <stdio.h>
#include <string.h>
main(){
int i, l, c = 1;
char word[20];
printf("Enter a word...\n");
scanf("%s",word);
l = strlen(word);

for (i = 0; i < l; i++){
  if (word[i] != word[l - i - 1]){
    c = 0;
  }
  printf("%c and %c\n", word[i], word[l - i - 1]);
}

if ( c == 1){
  printf("It's a palindrome!\n");
}else{
  printf("Aww it's not a palindrome...\n");
}

}
