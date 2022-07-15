#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int a[1000] = { 0 },b[1000], n, m,k, i,j,num=0,t;
	scanf("%d", &n);//n个数
	for (i = 0; i < n; i++) {//输入n个数
		scanf("%d", &a[i]);
	}
	//查重
	for(i=0;i<n;i++)
		for (j = i + 1; j < n; j++) {
			if (!(a[i] - a[j]))//等价于(a[i]==a[j])
				a[j] = 0;
		}
	//将除重之后的数组重新赋值给新数组
	for (i = 0,j=0; i < n; i++) {
		if (a[i] != 0) {
			b[j] = a[i];
			j++;
			num++;
		}
	}
	//选择法排序
	for (i = 0; i < num; i++) {
		k = i;
		for (j = i + 1; j < num; j++) {
			if (b[j] < b[k]) {
				k = j;
			}
		}
		t = b[k];
		b[k] = b[i];
		b[i] = t;
	}
	//冒泡法排序
	/*
	for(j=0;j<n-1;j++)
		for(i=0;i<n-1-j;i++){
			if(a[i]>a[i+1]){
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
	*/
	//输出
	printf("%d\n", num);
	for (i = 0; i < num; i++) {
		printf("%d ", b[i]);
	}
	return 0;
}