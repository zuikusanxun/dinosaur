#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int i,budget, surplus=0,o=0;//budget每个月预算，deposit表存款,surplus表示剩余钱数
	double deposit = 0;
	for (i = 1; i < 13; ++i) {

		scanf("%d", &budget);
		surplus = 300 + surplus - budget;//每月都会有300;
		if (surplus > 0 && surplus < 100) {

			continue;
		}
		if (surplus>=100) {

			o = 1;
			deposit += surplus/100;//有剩余100并存起来
			surplus = surplus % 100;
			continue;
		}
		if (surplus < 0) {

			o = 0;
			printf("-%d", i);
			break;
		}
	}
	if (o == 1) {

		printf("%.0lf", deposit*120+surplus);
	}
	return 0;
}