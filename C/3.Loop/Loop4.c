// Accept a number from user and find the total count of digit

#include <stdio.h>
int main()
{
    int k, n;
    printf("Enter the number = ");
    scanf("%d ", &n);
    for (k = 0; n > 0; n = n / 10)
    {
        k++;
    }
    printf("\n total digit = %d", k);
    return 0;
}