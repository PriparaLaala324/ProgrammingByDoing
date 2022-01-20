#include<iostream>
using namespace std;
int main()
{
    int number;
    int total=0;
    cout<<"Number: ";
    cin>>number;

    for(int i=1;i<=number;i++)
    {
        cout<<i<<" ";
        total=(i*(i+1))/2;
    }
    cout<<"The sum is "<<total<<".";
}