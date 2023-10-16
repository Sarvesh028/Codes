// Accept the two number and operator from user and do the operation on the basis of given operators.

#include <stdio.h>
int main()
{
    double num1, num2, cal;
    char op;
    printf(" Enter the First number = ");
    scanf("%lf", &num1);
    printf("\nEnter the Second Number= ");
    scanf("%lf", &num2);
    printf(" Choose the operator (+, -, *, /, <, >) which you want to do : ");
    scanf("\n %c", &op);
    switch (op)
    {
    case '+':
        cal = (num1 + num2);
        printf("The Sum = %lf", cal);
        break;
    case '-':
        cal = (num1 - num2);
        printf("The Subtraction = %lf", cal);
        break;
    case '*':
        cal = (num1 * num2);
        printf("The Product of Two number = %lf ", cal);
        break;
    case '/':
        cal = (num1 / num2);
        printf(" The division of Two Number = %lf", cal);
        break;
    case '<':
        if (num1 < num2)
        {
            printf(" %lf is Smaller than %lf", num1, num2);
        }
        else
        {
            printf(" %lf is Smaller than %lf", num2, num1);
        }
    case '>':
        if (num1 > num2)
        {
            printf(" %lf is Greater than %lf", num1, num2);
        }
        else
        {
            printf(" %lf is Greater than %lf", num2, num1);
        }
    default:
        printf("Invalid Details");
    }
    return 0;
}