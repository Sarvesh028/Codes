// Accept a number from the user and check it is odd or not

#include <stdio.h>

int main()
{
    int n;
    printf("\nEnter a number = ");
    scanf("%d", &n);
    if ((n % 2) != 0)
    {
        printf("\n The Number is Odd = %d", n);
    }
    else
    {
        printf("\nThe Number is not Odd = %d ", n);
    }
    return 0;
}