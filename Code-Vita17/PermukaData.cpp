#include<stdio.h>
#include<algorithm>
#include<climits>
using namespace std;
int main()
{
    long long int p;
    long long int a,b;
    long long int q,no;
    long long int count=0;
    scanf("%lld %lld",&p,&q);
    no=p;
    while(p>0)
    {
        p=p/10;
        count++;
    }
    long long int array1[count];
    a=0;
    while(no>0){
        array1[a]=no%10;
        no=no/10;
        a++;
    }

    sort(array1,array1+count);
    long long int numi;
    long long int ans=INT_MAX;
    long long int flg=0;
    do{
        numi=0;
        for(a=0;a<count;a++)
        {
            numi=numi*10+array1[a];
        }
        if(numi%q==0){
            if(numi<ans){
                ans=numi;
                flg=1;
            }
        }
    }while(next_permutation(array1,array1+count));
    if(flg==1) printf("%lld",ans);
    else printf("-1");
    return 0;
}
