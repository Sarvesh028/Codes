// Find the product from 1 to n;

#include <stdio.h>
int main()
{
    int i, n, p;
    printf("Enter a number = ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        p = p * i;
    }
    printf("The Product of Number which you have enter is = %d", p);
    return 0;
}