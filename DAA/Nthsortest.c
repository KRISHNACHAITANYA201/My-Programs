#include<stdio.h>
#include<stdlib.h>
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
int partition (int a[ ],int low,int high)
{
    int pivot=a[low];
    int i=low,j=high;
    while(i <= j)
    {
        while(i<=high && a[i]<=pivot)
        i++;
        while(a[j]>pivot)
        j--;
        if(i <= j)
        swap(&a[i],&a[j]);
   }
   swap(&a[low],&a[j]);
   return j;
}
int KSmall (int a[ ],int p,int low,int high)
{
    while(1)
    {
        int pi = partition(a,low,high);
        if(pi == p)
        return a[p];
        else if(p < pi)
        high=pi-1;
        else if(p > pi)
        low=pi+1;
    }
}
void main ( )
{
    int n,x,p;
    printf("Enter the Array size :");
    scanf("%d",&n);
    int *a = (int*)malloc(n * sizeof(int));
    printf("Enter array elements :");
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("Enter p value to find pth Element");
    scanf("%d",&p);
    x = KSamll(a,p-1,0,n-1);
    printf("Pth Smallest Element is %d\n",x);
}