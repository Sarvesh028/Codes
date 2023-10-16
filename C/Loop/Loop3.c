// Find the factorial of 5

#include <stdio.h>

int main()
{
    int i, s = 1;
    for (i = 1; i <= 5; i++)
    {
        s = s * i;
    }
    printf(" %d ", s);
    return 0;
}