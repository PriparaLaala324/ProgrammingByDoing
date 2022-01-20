#include<iostream>
using namespace std;
int main()
{
    int cFrom, cTo, cBy;
    cout<<"Count from: ";
    cin>>cFrom;
    cout<<"Count to: ";
    cin>>cTo;
    cout<<"Count by: ";
    cin>>cBy;

    for(int i=cFrom; i<=cTo; i=i+cBy)
    {
        cout<<i<<" ";
    }
}