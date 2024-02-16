//c program to find the largest of four number/
#include<stdio.h>
int main()
{
	int a,b,c,d;
	printf("Enter 1st number:");
	scanf("%d",&a);
	printf("Enter 2nd number:");
	scanf("%d",&b);
	printf("Enter 3rd number:");
	scanf("%d",&c);
	printf("Enter 4th number:");
	scanf("%d",&d);
	if(a>b)
	{
		if(a>c)
		{
			if(a>d)
			{
			printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,a);	
			}
		else
		{
			printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,d);
		}
		}
	}
	else    
	{
		if(b>c)
		{
			if(b>d)
			{
			printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,b);
			}
			else
			{
				printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,d);
			}
		}
	
	 else
	{
		if(c>d)
		{
		printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,c);	
		}
		else
		{
		printf("Enter numbers are %d, %d, %d and %d. The largest number is %d",a,b,c,d,d);	
		}
	}
}
	return 0;
}