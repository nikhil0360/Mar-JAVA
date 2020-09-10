#include <stdio.h>

// we can easily add new parameters for efficency to be define,
// but it would be diffcult to accomadate data about different types of cars
// even if we want to, either we can define it as a struct parameter and
// assign its value, or create different struct for different types of cars.
// which is not a proper approach, as their can be indefinite amount of
// type of cars.


struct car // car struct
{
  int type;
  float eff;
  float cap;
  float range;
};

int main(){

  int n ;
  scanf("%d",&n);
  struct car cars[n];

  for(int i = 0; i<n ; i++)
  {
    scanf("%d %f %f",&cars[i].type, &cars[i].eff, &cars[i].cap );
    // getting data from command line

    // calculating range
    if(cars[i].type == 1)
      cars[i].range = cars[i].eff * cars[i].cap ;

    else
      cars[i].range = (1000 * cars[i].cap) / cars[i].eff ;
  }

  for(int i = n-1; i >= 0 ; i--)
  {
    // printing the ranges, in reverse order
    printf("Car %d: %.2f\n", i + 1, cars[i].range);
  }

// if we want to sort the ranges, we can sort the array of structures
// and print the output.

  return 0;
}
