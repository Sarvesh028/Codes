// Accept the 5 number from user and Find the total count of even:

#include <stdio.h>
int main()
{
    int i, n, even = 0;
    for (i = 1; i <= 5; i++)
    {
        printf("Enter %d number = ", i);
        scanf("%d ", &n);
        if (n % 2 == 0)
        {
            even++;
        }
    }
    printf(" %d", even);
    return 0;
}