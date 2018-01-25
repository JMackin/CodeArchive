/*
 *  John Mackin
 *  09/03/2015
 *  Csci46 - 85226
 *  File: DataTypes_Mackin.c
 *  Purpose: Demonstrates C data types
 */

#include <stdio.h>

main()
{
  char size;
  size = sizeof(char);
  printf(" 1) size of char is \t\t %d \n", size);
  size = sizeof(unsigned char);
  printf(" 2) size of unsigned char is \t %d \n", size);
  size = sizeof(short);
  printf(" 3) size of short is \t\t %d \n", size);
  size = sizeof(unsigned short);
  printf(" 4) size of unsigned short is \t %d \n", size);
  size = sizeof(int);
  printf(" 5) size of int is \t\t %d \n", size);
  size = sizeof(unsigned int);
  printf(" 6) size of unsigned int is \t %d \n", size);
  size = sizeof(float);
  printf(" 7) size of float is \t\t %d \n", size);
  size = sizeof(long);
  printf(" 8) size of long is \t\t %d \n", size);
  size = sizeof(unsigned long);
  printf(" 9) size of unsigned long is \t %d \n", size);
  size = sizeof(long int);
  printf("10) size of long int is \t %d \n", size);
  size = sizeof(unsigned long int);
  printf("11) size of unsigned long int is %d \n", size);
  size = sizeof(long long);
  printf("12) size of longlong is \t %d \n", size);
  size = sizeof(unsigned long long);
  printf("13) size of unsigned longlong is %d \n", size);
  size = sizeof(long long int);
  printf("14) size of long long int is \t %d \n", size);
  size = sizeof(unsigned long long int);
  printf("15) size of unsd longlong int is %d \n", size);
  size = sizeof(double);
  printf("16) size of double is \t\t %d \n", size);
  size = sizeof(long double);
  printf("17) size of long double is \t %d \n", size);

}
