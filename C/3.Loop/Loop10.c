// Find the sum of even from 1 to n

#include <stdio.h>

int main()
{
    int i, n, s = 0;
    printf(" Enter the number = ");
    scanf("%d", &n);
    for (s = 0; n > 0; n = n / 10)
    {
        i = n % 10;
        if (i % 2 == 0)
        {
            s = s + i;
        }
    }
    printf("Sum of all even numbers = %d\n", s);
    return 0;
}