//https://www.codechef.com/START5C/problems/BLITZ3_2
#include <stdio.h>

int main(void) {
	long int T,res;
	int N,A,B;
		scanf("%ld",&T);
		for(int i=0;i<T;i++)
		{
		    scanf("%d %d %d",&N,&A,&B);
		    res = (2*(180+N)-(A+B));
		    printf("%d\n",res);
		}
	return 0;
}

