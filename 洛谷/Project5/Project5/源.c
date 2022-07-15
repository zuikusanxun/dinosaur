#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define max 30
int main()
{
	int a[10], high, num = 0,i;
	for (i = 0; i < 10; i++)
		scanf("%d", &a[i]);
	scanf("%d", &high);
	for (i = 0; i < 10; i++)
		if (a[i] <= (high + max))
			num++;
	printf("%d", num);
	return 0;
}