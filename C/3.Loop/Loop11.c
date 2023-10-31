// Find the sum of odd from 1 to n

#include <stdio.h>
int main()
{
    int i, n, s = 0;
    printf("Enter a number =  ");
    scanf("%d", &n);
    for (s = 0; n > 0; n = n / 10)
    {
        i = n % 10;
        if (i % 2 != 0)
        {
            s = s + i;
        }
    }
    printf("The sum of Odd Number = %d", s);
    return 0;
}