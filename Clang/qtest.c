#include <stdio.h>
void main()
{
int x = 2;

int * ptr = &x;
printf(" &x is %p\n", &x);
printf (" x is %d\n", *&x);
}
