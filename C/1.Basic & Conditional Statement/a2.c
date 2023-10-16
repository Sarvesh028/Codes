//Accept a number from the user and find its Cube

#include <stdio.h>

int main()
{
    int cube, x;
    printf("Enter a Number = ");
    scanf("%d", &x);
    cube = x * x * x;
    printf("The cube of numbers are = %d", cube);
    return 0;
}