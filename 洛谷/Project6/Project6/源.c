#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int l, m, a[100001] = { 0 }, b[100001] = { 0 }, i, x = 0;
	scanf("%d%d", &l, &m);
	for (i = 1; i <= 2 * m; i++)//ÊäÈëÇø¼ä
		scanf("%d", &a[i]);
	for (i = 1; i <= 2 * m; i++)
		if (a[i] == 0)
			b[0] = 1;
	for (i = 1; i <= m; i++)
		for (int j = 1; j <= l; j++)
		{
			if (j >= a[2 * i - 1] && j <= a[2 * i])
				b[j] = 1;
		}
	for(i=0;i<=l;i++)
		if (b[i] == 0)
			x++;
	printf("%d", x);
	return 0;
}