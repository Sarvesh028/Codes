//Accept a number from the user and the sum of the two numbers?

#include <stdio.h>

int main()
{
    int x, y;
    printf("Enter a Number = ");
    scanf("%d", &x);
    printf("Enter second Number = ");
    scanf("%d", &y);
    // int sum = x+y;
    printf("The sum of Two numbers are = %d", x + y);
    return 0;
}