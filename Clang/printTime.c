#include <stdio.h>

main()
{
  int pages, time;
  printf ("\nEnter amount of pages to be printed:");
  scanf("%d",&pages);
  time = pages * 10;
  printf ("\nIt will take %d seconds to print\n", time);
}
