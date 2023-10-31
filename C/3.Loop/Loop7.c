// Accept the number from user and find the sum of even digit;

#include <stdio.h>

int main()
{
    int n, k, s = 0;
    printf("Enter any number =  ");
    scanf("%d", &n);
    for (s = 0; n > 0; n = n / 10)
    {
        k = n % 10;
        if (k % 2 == 0)
        {
            s = s + k;
        }
    }
    printf("%d", s);
    return 0;
}