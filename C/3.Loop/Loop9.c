// Accept the number from user and add 1 to n

#include <stdio.h>

int main()
{
    int n, i, s = 0;
    printf("Enter a number =  ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {

        // printf("%d", i);
        s = s + i;
        printf("%d\n ", s);
    }
    printf(" \n The sum of your total number is = %d ", s);
    return 0;
}