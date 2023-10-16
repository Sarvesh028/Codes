// Accept week no from user and Display week name :

#include <stdio.h>
int main()
{
    int w;
    printf("Enter the Week number: \n");
    scanf("%d", &w);
    switch (w)
    {
    case 1:
        printf(" Monday ");
        break;
    case 2:
        printf(" Tuesday ");
        break;
    case 3:
        printf(" Wednesday ");
        break;
    case 4:
        printf(" Thrusday ");
        break;
    case 5:
        printf(" Friday ");
        break;
    case 6:
        printf(" Saturday ");
        break;
    case 7:
        printf(" Sunday ");
        break;
    default:
        printf(" Please enter the Number Between 1 to 7 ....... \t \t \n Invalid details ........");
    }
    return 0;
}