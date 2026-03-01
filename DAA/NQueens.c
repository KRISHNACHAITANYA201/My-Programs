#include<stdio.h>
#include<stdlib.h>
void write(int x[10],int n)
{
    for(int i=1;i<=n;i++)
        printf("%d\t",x[i]);
    printf("\n");
}
int place(int k,int i,int x[10])
{
    for(int j=1;j<=k-1;j++)
    {
        if((x[j]==i) || abs(j-k)==abs(x[j]-i))
            return 0;
    }
    return 1;
}
void NQueen(int k,int n,int x[10])
{
    for(int i=1;i<=n;i++)
    {
        if(place(k,i,x))
        {
            x[k]=i;
            if(k==n)
                write(x,n);
            else
                NQueen(k+1,n,x);
        }
    }
}
int main ( )
{
    int n,x[10];
    printf("Enter the No.of Queens :");
    scanf("%d",&n);
    NQueen(1,n,x);
    return 0;
}