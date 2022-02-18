#include<iostream>
#include<cmath>
using namespace std;
unsigned long long series(int n);
int main(){
    cout<<series(10);
    return 0;
}
unsigned long long series(int n){
    unsigned long long P;
    unsigned long long sum = 0;
    
    unsigned long long result=0, modulo=10000000000;

    for(int i=1; i<=n; i++)
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