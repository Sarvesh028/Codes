// Accept a number from the user and check it is divided by 5 or not . if not , display next number that is divide by 5

#include <stdio.h>

int main()
{
    int n;
    printf("Enter the number = ");
    scanf("%d", &n);
    if (n % 5 == 0)
    {
        printf("%d the number is divisible by 5 ", n);
    }
    else
    {
        n = n + 5 - (n % 5);
        printf("%d The number is divisible By 5 ", n);
    }
    return 0;
}