#include <stdio.h>

main(){
  char word[20];
  int x = 0, i = 0;
  scanf("%s",word);

while(1){
    x++;
    if(word[i] == '\0')
      break;
    i++;
}

printf("%d\n",x -1);
}
