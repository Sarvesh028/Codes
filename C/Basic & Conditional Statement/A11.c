// Accept year from the user and check it is leap year

#include <stdio.h>

int main()
{
    int n;
    printf("Enter the year = ");
    scanf("%d", &n);
    if (n % 4==0)
    {
        printf("This year is a leap Year %d", n);
    }
    else
    {
        printf("This is is not a leap year %d", n);
    }
    return 0;
}