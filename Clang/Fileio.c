#include <stdio.h>
#include <stdlib.h>
int main ( )
{

FILE *fr, *fw ;
int count = 0;
char name[8] ;
 
  fr = fopen ("names.txt", "r"); // read mode
  fw = fopen ("teams.txt", "a"); // write mode, w for write, a append

  if ( fr == NULL ) {
     printf (" Unable to read file name \n");
     exit( 0 );
  }
 
 count = fscanf(fr, "%s", name);
 	
 while (count > 0 ) {
    fprintf (fw, "The name I read from the file is: %s\n", name);
    count = fscanf(fr, "%s", name);
 }

 fclose(fr);
 fclose(fw);

}
   

  
