#include <stdio.h>

main(){
  char str1[32] = "Sierra College";
  char str2[32] = "Sierra College";
  int i, c = 1;
  for(i = 0; i < 32; i++){
    if (str1[i] != str2[i]){
      c = 0;
    }
  }
if(c == 1){
  printf("They're the same\n");
}else{
  printf("Not same\n");
}

}
