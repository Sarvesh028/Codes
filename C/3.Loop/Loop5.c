// Accept a number from user and find the sum of each digit

#include <stdio.h>
int main()
{
    int n, k;
    printf("Enter any Number : ");
    scanf("%d ", &n);
    for (k = 0; n > 0; n = n / 10)
    {
        k = k + n % 10;
    }
    printf("the digit sum = %d", k);
    return 0;
}