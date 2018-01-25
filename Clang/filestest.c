#include <stdio.h>
#include <stdlib.h>
int main ( )
{

FILE *fp ;
int count = 0;
char name[8] ;
 
  fp = fopen ("names.txt", "r");

  if ( fp == NULL ) {
     printf (" Unable to read file name \n");
     exit( 0 );
  }
 
 count = fscanf(fp, "%s", name);
 
 while (count > 0 ) {
    printf ("The name I read from the file is: %s\n", name);
    count = fscanf(fp, "%s", name);
 }

 fclose(fp);

}
