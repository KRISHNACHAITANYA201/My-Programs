#include<stdio.h>
#include<stdlib.h>
#define INF 9999
int min(int a,int b)
{
    if(a>=b)
    return b;
    return a;
}
void Apsp(int cost[10][10],int a[10][10],int n)
{
    int i,j;
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        a[i][j]=cost[i][j];
    }
    for(int k=1;k<=n;k++)
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        a[i][j]=min(a[i][j],a[i][k]+a[k][j]);
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
}
void main ( )
{
    int a[10][10],cost[10][10];
    int n,m,t1,t2,w;
    printf("Enter the no.of vertices :");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    for(int j=1;j<=n;j++)
    {
        if(i==j)
        cost[i][j]=0;
        else
        cost[i][j]=INF;
    }
    printf("Enter the no.of edges :");
    scanf("%d",&m);
    for(int k=1;k<=m;k++)
    {
        printf("Enter the Edge %d :",k);
        scanf("%d %d",&t1,&t2);
        printf("Enter the weight of edge %d :",k);
        scanf("%d",&w);
        cost[t1][t2]=w;
    }
    for(int i=1;i<=n;i++)
    for(int j=1;j<=n;j++)
    {
        a[i][j]=0;
    }
    Apsp(cost,a,n);
}