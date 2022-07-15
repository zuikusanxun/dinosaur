#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	double sn=0,k,t;
	int n;
	scanf("%lf", &k);
	for (n = 1; sn <k; n++)
	{
		t = (1.0) / n;
		sn =sn+t;
	}
	printf("%d", n);
	return 0;
}