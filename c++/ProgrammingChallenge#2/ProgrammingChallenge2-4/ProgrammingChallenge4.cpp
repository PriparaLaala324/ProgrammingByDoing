#include<iostream>
#include<cmath>
using namespace std;
unsigned long long series(int num);
int num;
int main(){
    cout<<"Enter a number: ";
    cin>>num;
    cout<<series(num);
    return 0;
}
unsigned long long series(int num){
    unsigned long long P;
    unsigned long long sum = 0;
    
    unsigned long long result=0, modulo=10000000000;

    for(int i=1; i<=num; i++)
    {
        unsigned long long temp=i;
        for (int j=1; j<i; j++)
        {
            temp =temp*i;
        }
        temp=temp%modulo;
        result=result+temp;
        result=result%modulo;
    }
    return result;
}