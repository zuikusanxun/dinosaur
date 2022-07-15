#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int n, i,j,t,m=0,a[10000];
	scanf("%d", &n);
	for (i = 0; i < n; ++i) {

		scanf("%d", &a[i]);
	}
	//用冒泡法进行排序
	for (i = 0; i < n - 1; i++) {

		for (j = 0; j < n - 1 - i; j++) {

			if (a[j] > a[j + 1]) {

				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				m++;
			}
		}
	}
	printf("%d", m);
	return 0;
}