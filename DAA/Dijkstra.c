#include<stdio.h>
#include<stdlib.h>
#define INF 9999
void ShortestPath(int v,int cost[10][10],int n,int dist[10])
{
    int i,j,num,u,m,s[n];
    for(i=1;i<=n;i++)
    {
        s[i]=0;
        dist[i]=cost[v][i];
    }
    s[v]=1;
    for(num=2;num<=n;num++)
    {
        int min=INF;
        for(j=1;j<=n;j++)
        {
            if(s[j]==0 && min>dist[j])
            {
                min=dist[j];
                u=j;
            }
        }
        s[u]=1;
        for(int w=1;w<=n;w++)
        {
            if(s[w]!=1 && dist[w]>(dist[u]+cost[u][w]))
            dist[w]=dist[u]+cost[u][w];
        }
    }
}
void main ( )
{
    int cost[10][10],i,j,v,n,dist[10];
    printf("Enter the size of adjacency Matrix :");
    scanf("%d",&n);
    printf("Enter the adjacency Matrix :");
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        scanf("%d",&cost[i][j]);
        if(i!=j && cost[i][j]==0)
        cost[i][j]=INF;
    }
    printf("Enter the starting vertix :");
    scanf("%d",&v);
    printf("The shortest path is :"); 
    ShortestPath(v,cost,n,dist);
    for(i=1;i<=n;i++)
    {
        if(i!=v)
        printf("visited %d:%d\n",i,dist[i]);
    }
}
