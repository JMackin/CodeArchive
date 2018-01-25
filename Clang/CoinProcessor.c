#include <stdio.h>

main()
{
int numQuarters, numDimes, numNickels, numPennies, totalValue, numOneDollars;

printf ("Enter amount of Quarters:\n");
scanf ("%d", &numQuarters);
printf ("\nEnter amount of Dimes:\n");
scanf ("%d", &numDimes);
printf ("\nEnter amount of Nickels:\n");
scanf ("%d", &numNickels);
printf ("\nEnter amount of Pennies:\n");
scanf ("%d", &numPennies);

totalValue = (numQuarters * 25) +
(numDimes * 10) +
(numNickels * 5) +
(numPennies);

printf ("\nTotal change value is %d cents\n", totalValue);

numOneDollars = totalValue / 100;
printf ("\n%d Dollars\n", numOneDollars);
totalValue = totalValue - (numOneDollars * 100);

numQuarters = totalValue / 25;
printf ("%d Quarters\n", numQuarters);
totalValue = totalValue - (numQuarters * 25);

numDimes = totalValue / 10;
printf ("%d Dimes\n", numDimes);
totalValue = totalValue - (numDimes * 10);

numNickels = totalValue / 5;
printf ("%d Nickels\n", numNickels);
totalValue = totalValue - (numNickels * 5);

numPennies = totalValue;
printf ("%d Pennies\n", numPennies);
}
