#include<stdio.h>
#include<stdlib.h>
#define INF 9999
void FWord(int c[10][10],int n)
{
    int p[10],cost[10];
    cost[n]=0;
    p[n]=n;
    for(int i=n-1;i>=1;i--)
    {
        cost[i]=INF;
        for(int j=i+1;j<=n;j++)
        {
            if(c[i][j]!=INF && cost[i]>cost[j]+c[i][j])
            {
                cost[i]=cost[j]+c[i][j];
                p[i]=j;
            }
        }
    }
    printf("Minimum cost = %d\n",cost[1]);
    printf("Minimum Path :");
    int i=1;
    while(i!=n)
    {
        printf("%d-->",i);
        i=p[i];
    }
    printf("%d",n);
}
void main( )
{
    int n,i,j,c[10][10];
    printf("Enter the number of vertices :");
    scanf("%d",&n);
    printf("Enter cost adjacency matrix :");
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        scanf("%d",&c[i][j]);
    }
    FWord(c,n);
}