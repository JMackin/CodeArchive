#include <stdio.h>

main()
{
  printf("Enter some kind of string...\n");
  int j, i;
  char x;
  int freq[40];

  for (i = 0; i < 40; i++){ freq[i] = 0; }
  i = 0;

  while(x != '\n'){
    scanf("%c",&x);
    if (x == 75 || x== 107){ /*for some reason the program stopped reading characters if i type 'k'*/
      freq[10]++;            /*so this was the only work around.. */
      }
    else{
    if (x > 64 && x < 91){
      x = x % 65;
      freq[x]++;
    }else if(x > 96 && x < 173){
      x = x % 97;
     freq[x]++;
    }
    }
  }

  for(j =0; j < 26; j++){
      printf("%c:", j + 65);
    printf("%d\n",freq[j]);
  }
}
