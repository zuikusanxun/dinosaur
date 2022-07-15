#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {

	int a[100] = { 0 };
	int i, j, k;
	int n;
	scanf("%d", &n);
	for (i = 0; i < n-1; i++) {

		a[i] = 1;

	}
	for (i = 0; i < n; i++) {

		printf("%d ", a[i]);
	}
	return 0;
}