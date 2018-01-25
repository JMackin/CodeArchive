#include <stdio.h>

main()
{
  float weight, height, index;

  printf("Enter your body weight in lbs: ");
  scanf("%f", &weight);
  printf("Enter your height in inches: ");
  scanf("%f", &height);

  index = (weight * 703) / (height * height);
  printf("Your BMI is: %f\n", index);

  if (index < 18.5){
    printf("You are underwight\n");
  }else if ((index >= 18.5) && (index <= 24.9)){
    printf("You are normal\n");
  }else if ((index >= 25) && (index <= 29.9)){
    printf("You are overweight\n");
  }else{
    printf("you are obese\n");
  }

}
