#include<stdio.h>
#include<conio.h>
int main()
{
    int n,p=1;
    printf("Enter a number:");
    scanf("%d",&n);
    if(n<=1)
    {
        printf("1 and 0 is neither prime nor composite");
    }
    else
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                p=0;
                break;
            }
        }
        if(p==1)
        {
            printf("%d is a prime number",n);
        }
        else
        {
            printf("%d is not a prime number",n);
        }
    }
  
  
    return 0;
}