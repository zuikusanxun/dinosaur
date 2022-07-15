#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
	int n;
	int i=0, j=0;
	scanf("%d", &n);
	while (n > j)
	{
		i++;
		j = j + i;
	}
	if (i % 2 == 0)
		printf("%d/%d", i-(j-n), j - n+1);
	if (i % 2 != 0)
		printf("%d/%d", j - n + 1, i - (j - n));
	return 0;
}
