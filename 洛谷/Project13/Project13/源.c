#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {

	//P1146 硬币翻转
	int a[101] = { 0 };
	int n;
	scanf("%d", &n);
	printf("%d\n", n);
	for (int i = 1; i <= n; i++) {	//每一行

		for (int j = 1; j <= n; j++) {	//每一行的内容

			if (i != j) {	//根据样例，第i行的第i个不翻

				if (a[j] ==1) {	//翻转

					a[j] = 0;
				}
				else {

					a[j] = 1;
				}
			}
			printf("%d", a[j]);
		}
		printf("\n");
	}
	return 0;
}