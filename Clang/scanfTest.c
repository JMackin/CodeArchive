#include <stdio.h>
main()
{
  int x, y;
  int z;
  char ch;
  float f;

  printf ("Values for x and y \n");
  z = scanf("%d%d%c",&x, &y, &ch);
  printf ("Number of items read is %d \n", z);
  printf ("Values for x = %d and y = %d are \n", x, y);

  scanf("%c",&ch);

  printf ("values for ch \n");
  z = scanf ("%c", &ch);
  printf ("The number of items read is %d \n", z);
  printf ("values for ch = %c \n", ch);
}
