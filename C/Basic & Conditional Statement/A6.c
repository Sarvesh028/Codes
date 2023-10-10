// Accept a number from the user and Check the it is Positive even

#include <stdio.h>

int main()
{
    int n;
    printf("\nEnter any Number = ");
    scanf("%d", &n);
    if ((n > 0) && ((n % 2) == 0))
    {
        printf("\n The Number is Positive Even = %d", n);
    }
    else
    {
        printf("\n The number is not Positive Even = %d", n);
    }
    return 0;
}