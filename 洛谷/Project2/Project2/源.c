#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	double a, b;
	scanf("%lf %lf", &a, &b);
	printf("%.0lf", a + b);
	return 0;
}