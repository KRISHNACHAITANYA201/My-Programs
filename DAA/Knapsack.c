#include<stdio.h>
#include<stdlib.h>
void KnapSack(int m,int n,int w[20],int p[20],float ratio[10])
{
    float x[10],profit=0.0;
    int i,u=m;
    for(i=0;i<n;i++)
    x[i]=0.0;
    for(i=0;i<n;i++)
    {
        if(w[i]>u)
        break;
        x[i]=1.0;
        u=u-w[i];
    }
    if(i<=n)
    x[i]=(float)u/w[i];
    for(i=0;i<n;i++)
    profit+=x[i]*p[i];
    printf("Total profit is : %.2f ",profit);
}
void main ( )
{
    int p[20],w[20],m,n;
    printf("Enter the size of Knapsack :");
    scanf("%d",&m);
    printf("Enter the no.of items :");
    scanf("%d",&n);
    float ratio[10];
    printf("Enter the profit and weight ratios :");
    for(int i=0;i<n;i++)
    {
        scanf("%d%d",&p[i],&w[i]);
        ratio[i] = p[i] / w[i];
    }
    for(int i=0;i<n-1;i++)
    for(int j=i+1;j<n;j++)
    {
        if(ratio[i] < ratio[j])
        {
            float temp=ratio[i];
            ratio[i]=ratio[j];
            ratio[j]=temp;
            int temp1=p[i];
            p[i]=p[j];
            p[j]=temp1;
            temp1=w[i];
            w[i]=w[j];
            w[j]=temp1;
        }
    }
    KnapSack(m,n,w,p,ratio);
}