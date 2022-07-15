#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int a[5];//存每一位
	int sub[3];//存sub 1-3
	int k;
	scanf("%d", &k);
	//遍历10000-30000
	int flag = 0;
	for (int num = 10000; num <= 30000; num++) {

		int t = num;
		int s = 10000;//除数
		//取位数
		for (int i = 0; i < 5; i++) {

			a[i] = t / s;
			t = t % s;
			s = s / 10;
		}

		//存入sub中
		sub[0] = a[0] * 100 + a[1] * 10 + a[2];
		sub[1] = a[1] * 100 + a[2] * 10 + a[3];
		sub[2] = a[2] * 100 + a[3] * 10 + a[4];

		//判断是否可以被k整除
		if ((sub[0] % k == 0) && (sub[1] % k == 0) && (sub[2] % k == 0)) {

			printf("%d\n", num);
			flag = 1;
		}
	}
	if (flag == 0) {

		printf("No\n");
	}
	return 0;
}
