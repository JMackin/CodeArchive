#include <stdio.h>

int main()
{

  char ch;
  printf ("Press a key: \n");
  ch = getchar();
  printf (" The ascii character value you entered is %d \n", ch);
  printf (" The character you entered is %c \n", ch);
  char ci = 98;
  printf ("%c\n", ci);
  printf ("%d \n", ci);
  char ck = 'S';
  printf ("%d \n", ck);
  printf ("%c\n", ck);
  char cj = 'A';
  char end = '\n';
  putchar (cj);
  putchar (end);
  putchar ('X');
  putchar (end);
}
