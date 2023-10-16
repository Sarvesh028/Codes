// Accept the two number from user and find the greatest number

#include <stdio.h>
int main()
{
    int x, y;
    printf("Enter First number = ");
    scanf("%d", &x);
    printf("Enter Second number = ");
    scanf("%d", &y);
    if (x > y)
    {
        printf("\n %d is greater than %d" ,x,y);
    }
    else
    {
        printf("\n %d is greater than %d",y,x);
    }
    return 0;
}