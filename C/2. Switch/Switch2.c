// Accept month np from user and display the season:

#include <stdio.h>
int main()
{
    int m;
    printf("Enter a number between 1 to 12 =  ");
    scanf("%d", &m);
    switch (m)
    {
    case 11:
    case 12:
    case 1:
    case 2:
        printf(" Winter Season ");
        break;
    case 3:
    case 4:
    case 5:
    case 6:
        printf(" Summer Season ");
        break;
    case 7:
    case 8:
    case 9:
    case 10:
        printf(" Rainy Season ");
        break;
    default:
        printf("Invalid Month");
    }
    return 0;
}