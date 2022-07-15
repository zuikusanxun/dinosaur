#define _CRT_SECURE_NO_WARNINGS
//P1150
#include<stdio.h>

int main()
{
	int n, k;
	scanf("%d%d", &n, &k);
	int sum = n;//最终能抽的烟的数量
	while (n >= k) {

		sum = sum + (n / k);
		n = n / k + n % k;//没换完的+新换的
	}
	printf("%d", sum);
	return 0;
}