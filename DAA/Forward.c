#include<stdio.h>
#include<stdlib.h>
#define INF 999
void Fmsg(int c[10][10],int n)
{
    int i,j;
    int cost[10],p[10];
    cost[n]=0;
    p[n]=n;
    for(i=n-1;i>=1;i--)
    {
        cost[i]=INF;
        for(j=i+1;j<=n;j++)
        {
            if(c[i][j]!=INF && cost[i]>cost[j]+c[i][j])
            {
                cost[i]=cost[j]+c[i][j];
                p[i]=j;
            }
        }
    }
    printf("Minimum cost is :%d\n",cost[1]);
    printf("Minimum cost path :");
    i=1;
    while(i!=n)
    {
        printf("%d-->",i);
        i=p[i];
    }
    printf("%d",p[n]);
}
void main ( )
{
    int k,n,i,j,c[10][10];
    printf("Enter the Number of vertices :");
    scanf("%d",&n);
    printf("Enter the cost adjacency matrix :");
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        scanf("%d",&c[i][j]);
        if(i!=j && c[i][j]==0)
        c[i][j]=INF;
    }
    Fmsg(c,n);
}