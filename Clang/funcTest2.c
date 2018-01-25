#include <stdio.h>
void swap ( int *, int *) ; // PROTOTYPE, pass by reference
void increment (int *);  //PROTOTYPE

int main ( )
{
 //Swap
 int x = 800, y = 100 ;
 swap ( &x, &y ); // doesn't use the third variable
 printf ("main: x = %d, y = %d  \n", x, y);

 //incriment
 int input[5] = { 8, 3, 1, 7, 6 };
 increment(input);
 int i = 0;
  for ( i = 0 ; i < 5 ; i++)
    printf (" index i = %d value %d \n", i, input[i]) ;
}

void increment ( int *data)  // declared as a pointer
{
  int i = 0;
  for ( i = 0 ; i < 5 ; i++)
    data[i]++ ;
}

void swap ( int *a, int *b )
{
 *a = *a + *b;
 printf("%d\n",*a);
 *b = *a - *b;
 printf("%d\n",*b);
 *a = *a - *b;
 printf("%d\n",*a);
 printf ("Swap: a = %d, b = %d  \n", *a, *b);
}

