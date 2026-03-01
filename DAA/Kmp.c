#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void ComputePrefixFun(char p[ ],int pi[10],int m)
{
    int k=0;
    pi[0]=0;
    for(int i=1;i<m;i++)
    {
        while(k>0 && p[k]!=p[i])
        k=pi[k-1];
        if(p[k]==p[i])
        k++;
        pi[i]=k;
    }
}
void KmpMatcher(char t[ ],char p[ ])
{
    int n=strlen(t);
    int m=strlen(p);
    int pi[m];
    ComputePrefixFun(p,pi,m);
    int q=0;
    for(int i=0;i<n;i++)
    {
        while(q>0 && p[q]!=t[i])
        q=pi[q-1];
        if(p[q]==t[i])
        q++;
        if(q==m)
        {
            printf("pattern found at shift %d\n",i-m+1);
            q=pi[q-1];
        }
    }
}
void main ( )
{
    char t[20]="abcdbdcdabcd";
    char p[20]="abc";
    KmpMatcher(t,p);
}