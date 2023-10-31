// Accept 5 number from user and find the Smallest:

#include <stdio.h>
int main()
{
    int i, n, g;
    for (i = 1; i <= 5; i++)
    {
        printf("Enter %d number = ", i);
        scanf("%d", &n);
        if (i == 1)
        {
            g = n;
        }
        else if (g > n)
        {
            g = n;
        }
    }
    printf("The Greatest Number = %d", g);
    return 0;
}