#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int a[7], b[7];
	int i,t;
	for (i = 0; i < 7; ++i) {

		scanf("%d%d", &a[i],& b[i]);
	}
	for (i = 0; i < 7; ++i) {

		if (a[i] + b[i] > 8) {

			t = i + 1;
			break;
		}
		else
			t = 0;
	}
	printf("%d", t);
	return 0;
}