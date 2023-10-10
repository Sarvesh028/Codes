// Accept a number from the user and Check the it is negative odd

#include <stdio.h>

int main()
{
    int n;
    printf("\n Please Enter the number = ");
    scanf("%d", &n);
    if ((n < 0) && ((n % 2) != 0))
    {
        printf("\n The Enter Number is Negative and Odd = %d", n);
    }
    else
    {
        printf("\nThe Entered Number is not negative or Odd = %d", n);
    }
    return 0;
}