#include<iostream>
using namespace std;
void findSum(int n);
void findSum2(int n);
void findSumAnyTwo(int a, int b, int n);
void findSumAnyN(int a, int b, int n);

int sum=0;
int sum2=0;
int sum3=0;
int sum4=0;

int main()
{
    findSum(10);
    findSum(1000);
    findSumAnyTwo(2, 5, 100);
    findSumAnyN(8, 10, 500);
    return 0;
}
void findSum(int n)
{
    for(int i=0; i<n; i++)
    {
        if((i%3==0) || (i%5==0))
        {
            sum+=i;
        }
    }
    cout<<sum<<endl;
}
void findSum2(int n)
{
    for(int i=0; i<n; i++)
    {
        if((i%3==0) || (i%5==0))
        {
            sum2+=i;
        }
    }
    cout<<sum2<<endl;
}
void findSumAnyTwo(int a, int b, int n)
{
    for(int i=0; i<n; i++)
    {
        if((i%a==0) || (i%b==0))
        {
            sum3+=i;
        }
    }
    cout<<sum3<<endl;
}
void findSumAnyN(int a, int b, int n)
{
    for(int i=0; i<n; i++)
    {
        if((i%a==0) || (i%b==0))
        {
            sum4+=i;
        }
    }
    cout<<sum4<<endl;
}