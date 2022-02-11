#include<iostream>
#include<cmath>
using namespace std;
unsigned long long series(int n);
int main(){
    series(10);
    return 0;
}
unsigned long long series(int n){
    unsigned long long P;
    unsigned long long sum = 0;

    for(int i=1; i<=n; i++){
        P=pow(i,i);
        sum+=P;
    }cout<<sum<<endl;
    return sum;
}