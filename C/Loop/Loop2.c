// Find the sum from 1 to 5

#include <stdio.h>
int main()
{
    int i, s = 0;
    for (i = 1; i <= 5; i++)
    {
        s = s + i;
    }
    printf("\n %d ", s);
    return 0;
}