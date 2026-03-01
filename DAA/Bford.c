#include<stdio.h>
#include<stdlib.h>
#define INF 999
int a[10][10],dist[10],n;
void bford(int v)
{
    for(int i=1;i<=n;i++)
    dist[i]=a[v][i];
    for(int k=2;k<n;k++)
    {
            for(int u=1;u<=n;u++)
            for(int i=1;i<=n;i++)
            {
                if(u!=v && a[i][u]!=INF)
                if(dist[u]>dist[i]+a[i][u])
                dist[u]=dist[i]+a[i][u];
            }
    }
}
void main ( )
{
     int v,i,j; 
     printf("Enter no.of vertices\n");
     scanf("%d",&n);
     printf("Enter the cost adj matrix :\n");
     for(i=1;i<=n;i++)
     for(j=1;j<=n;j++)
     {
         printf("Enter a[%d][%d]= ",i,j);
         scanf("%d",&a[i][j]);
         if(i!=j && a[i][j]==0)
         a[i][j]=INF;
     }
     for(i=1;i<=n;i++)
     dist[i]=0;
     printf("Enter the source vertix :\n");
     scanf("%d",&v);
     bford(v);
     printf("The shortest path cost from source vertix %d to all other vertices is :\n",v );
     for(i=1;i<=n;i++)
     printf("%d\t",dist[i]);
}