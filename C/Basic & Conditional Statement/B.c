// Accept Student ID As integer, Course fee and 3 installments find total installment and balance.
// Display the remarks on the basis of balance.

#include <stdio.h>

int main()
{
    int i, f, a, b, c, total, balance;
    printf("Enter the ID =  ");
    scanf("%d", &i);
    printf("Enter The Course fee = ");
    scanf("%d", &f);
    printf("Enter the First Installment = ");
    scanf("%d", &a);
    printf("Enter the Second Installment = ");
    scanf("%d", &b);
    printf("Enter the Third Installment = ");
    scanf("%d", &c);
    total = a + b + c;
    printf("The total installment = %d", total);
    balance = f - total;
    printf("\n Left Balance is %d ", balance);
    printf("\n Remarks = ");
    if (f == total)
    {
        printf(" No dues ");
    }
    else if (f > total)
    {
        printf(" Dues; please pay as Soon as Possible");
    }
    else
    // ( f < total)
    {
        printf(" Your Payment is Refunded By the Institution ");
    }
    return 0;
}