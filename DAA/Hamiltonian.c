#include<stdio.h>
#include<stdlib.h>
void nextValue(int k,int x[10],int n,int c[10][10])
{
    int j;
    while(1)
    {
        x[k]=(x[k]+1) % (n+1);
        if(x[k]==0)
        return ;
        if(c[x[k-1]][x[k]]!=0)
        {
            for(j=1;j<=k-1;j++)
            {
                if(x[j]==x[k])
                    break;
            }
            if(j==k)
            {
                if(k<n || (k==n && c[x[n]][x[1]]!=0))
                return ;
            }
        }
    }
}
void Hamiltonion(int k,int x[10],int n,int c[10][10])
{
    while(1)
    {
        nextValue(k,x,n,c);
        if(x[k]==0)
        return ;
        if(k==n)
        {
            for(int i=1;i<=n;i++)
            printf("%d\t",x[i]);
            printf("\n");
        }
        else
        Hamiltonion(k+1,x,n,c);
    }
}
void main ( )
{
    int n,i,j,x[10],c[10][10];
    printf("Enter the No.of vertices :");
    scanf("%d",&n);
    printf("Enter the Graph :");
    for(i=1;i<=n;i++)
    for(j=1;j<=n;j++)
    {
        scanf("%d",&c[i][j]);
    }
    for(i=1;i<=n;i++)
    x[i]=0;
    x[1]=1;
    Hamiltonion(2,x,n,c);
}