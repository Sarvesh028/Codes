// Accept a number from the user and the check the numbe is +ve or not

#include <stdio.h>

int main()
{
    int n;
    printf("\n Enter a number = ");
    scanf("%d", &n);
    if (n > 0)
    {
        printf("\n %d is positive ", n);
    }
    else
    {
        printf("\n %d is not Positive or 0 ", n);
    }
    return 0;
}