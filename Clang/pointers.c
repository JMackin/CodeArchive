#include <stdio.h>
main(){
int x = 100;
printf("Address of x is %p \n", &x);
int * ptr;
ptr = &x;
printf("The addr ptr is storing is %p\n", ptr);
int y = *ptr;
printf("The value at blah is %d\n",y);
int z = 200;
int *ptr2 = &z;
printf("This other value is %d\n", *ptr2);
printf("This other pointers address is %p\n", ptr2);
char *ptr3 = "Rocklin";
char a = 'A';
char * ptr4 = &a;
char * ptr5 = &a;
printf("%p and %c\n", ptr4, *ptr5);

int nameBuf[5]  = {0x8, 0xf, 0x23432123, 0x9023};

int *cptr = nameBuf;

printf("%p\n",cptr);
printf("%d\n",*cptr);
cptr++;
printf("%p\n",cptr);
printf("%d\n",*cptr);

int b = *cptr++;

printf("%x\n",b);
cptr++;
printf("%d\n",*cptr);
b = *cptr++;
printf("%d\n",b);


}
