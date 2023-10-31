// Accept 5 number from user and find the sum of positive even:

#include <stdio.h>
int main()
{
    int i, n, s = 0;
    for (i = 1; i <= 5; ++i)
    {
        printf("Enter %d numbers= \n", i);
        scanf("%d", &n);
        if (n % 2 == 0 && n > 0)
        {
            s += n;
        }
    }
    printf("\nsum of positive even = %d\n", s);
    return 0;
}
