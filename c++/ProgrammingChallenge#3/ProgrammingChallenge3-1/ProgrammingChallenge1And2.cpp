#include<iostream>
#include<cmath>
using namespace std;
//int findSum=0;

int findSum(int expo, int num)
{
    int totalNum=0, lastDigit, division=10;
    for(int i=0; i<expo; i++)
    {
        lastDigit=num%10;
        totalNum=totalNum+pow(lastDigit, expo);
        num=num/division;
    }
    return totalNum;
}
int main()
{
    int inputN;
    cout<<"Input N:=";
    cin>>inputN;
    int sum=0;
    for(int i=2; i<350000; i++)
    {
        if(findSum(inputN, i)==i)
        {
            sum+=i;
            cout<<"i:="<<i<<endl;
        }
    }
    cout<<"My Sum:="<<sum<<endl;
}
