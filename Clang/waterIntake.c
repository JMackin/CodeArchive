#include <stdio.h>

main()
{
  int weight, water;
  printf("Enter your weight in lbs: ");
  scanf ("%d", &weight);
  water = weight / 2;
  printf ("\nYou should drink %d oz of water daily\n", water);
}
