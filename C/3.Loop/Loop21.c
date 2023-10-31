// Accept 5 number from user and find the total count of positive even number:

#include <stdio.h>
int main()
{
    int i, n, p = 0;
    for (i = 1; i <= 5; ++i)
    {
        printf("Enter %d numbers =\n", i);
        scanf("%d", &n);
        if (n > 0 && n % 2 == 0)
        {
            p++;
        }
    }
    printf("\n Total count of positive even numbers is = %d\n", p);
    return (0);
}