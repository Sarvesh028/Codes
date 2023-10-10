// Accept the age from user and check the user is eligible for voting or not

#include <stdio.h>

int main()
{
    int n;
    printf("Enter your Age = ");
    scanf("%d", &n);
    if (n >= 18)
    {
        printf("Congrats You are eligible for Voting ");
    }
    else
    {
        printf("Sorry you are Not Eligible to vote");
    }
    return 0;
}