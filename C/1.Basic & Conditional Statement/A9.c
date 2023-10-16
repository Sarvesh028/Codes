// Accept the three number from user and find the greatest number

#include <stdio.h>

int main()
{
    int a, b, c;
    printf("\n Enter the first number = ");
    scanf("%d", &a);
    printf("Enter the Second number = ");
    scanf("%d", &b);
    printf("Enter the third Number = ");
    scanf("%d", &c);
    if ((a > b) && (a > c))
    {
        printf("%d is greater than %d, %d", a, b, c);
    }
    if ((b > a) && (b > c))
    {
        printf("%d is greater than %d, %d", b, a, c);
    }
    else if(c>a && c>b)
    {
        printf("%d is greater than %d , %d", c, a, b);
    }
    return 0;
}