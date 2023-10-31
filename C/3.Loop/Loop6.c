// Accept a number from user and Display in reverse order

#include <stdio.h>

int main()
{
    int n, k;
    printf("Enter any number =  ");
    scanf("%d", &n);
    for (k = 0; n > 0; n = n / 10)
    {
        k = k * 10 + n % 10;
    }
    printf("Reversed Number is %d\n", k);
    return 0;
}