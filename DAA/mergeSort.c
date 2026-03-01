#include<stdio.h>
#include<stdlib.h>
void merge(int a[20],int low,int mid,int high)
{
    int b[20],k;  
    int i=low,j=mid+1;k=low;
    while (i<=mid && j<=high)
    {
        if (a[i] <= a[j])
        {
            b[k]=a[i];
            i++;
            k++;
        }
        else
        {
            b[k]=a[j];
            j++;
            k++;
        }
    }
    if(i<=mid)
    {
        for(int l=i;l<=mid;l++)
        {
            b[k]=a[l];
            k++;
        }
    }
    if (j<=high)
    {
        for(int l=j;l<=high;l++)
        {
            b[k]=a[l];
            k++;
        }
    }
    for (int x=low;x<=high;x++)
    {
        a[x]=b[x];
    }
}
void mergeSort(int a[20],int low,int high)
{
    int mid;
    if(low < high)
    {
        mid = (low + high) / 2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }
}
int main ( )
{
    int a[20],n;
    printf("Enter the No.of Elements in Array :\n");
    scanf("%d",&n);
    printf("Enter The Array Elements :");
    for (int i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("The Elements Before Sorting ");
    for(int i=0;i<n;i++)
    printf("%d\t",a[i]);
    mergeSort(a,0,n-1);
    printf("The elements after sorting are");
    for(int i=0;i<n;i++)
    printf("%d\t",a[i]);
}