// Accept 5 number from user and find the sum of all number:

#include <stdio.h>
int main()
{
    int i, n, sum = 0;
    for (i = 1; i <= 5; i++)
    {
        printf("Enter a %d number: ", i);
        scanf("%d", &n);
        sum += n;
    }
    printf("\nsum=%d\n", sum);
    return 0;
}