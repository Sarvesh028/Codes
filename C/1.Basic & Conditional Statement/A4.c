// Accept a number from the user and Check it is even or not ?

#include <stdio.h>

int main()
{
    int n;
    printf("\nEnter a Number = ");
    scanf("%d", &n);
    if ((n % 2) == 0)
    {
        printf("\nThe number Is even = %d", n);
    }
    else
    {
        printf("\nThe number is not even = %d", n);
    }
    return 0;
}