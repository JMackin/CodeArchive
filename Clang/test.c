#include <stdio.h>
#include <string.h>
#include <stdlib.h>
/*
void ud(int *x){
 *x = *x+2;
}
*/
/*
int t(){
  static int x = 10;
  return x++;
}
*/
/*
int main(int argc, char *argv[])
{
#if 0
  printf("%s\n",argv[0]);
#else
  printf("The num of args is %d\n",argc);
#endif
*/

//#define prod(x,y) x*y

typedef struct _sitcoms{
  char name[20];
  //Sitcoms_t *next;
} Sitcoms_t;

int main()
{
  int x = sizeof(Sitcoms_t);
}
