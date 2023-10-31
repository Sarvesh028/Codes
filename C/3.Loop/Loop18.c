// Accept 5 number from user and find the Sum of Even Number:

#include <stdio.h>
int main()
{
    int i, n, sum = 0;
    for (i = 1; i <= 5; i++)
    {

        printf("Enter %d number = ", i);
        scanf("%d", &n);
        if (n % 2 == 0)
        {
            sum += n;
        }
        
    }
    printf(" %d ", sum);
}