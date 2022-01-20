#include <iostream>
using namespace std;
int main ()
{
    int number;
    int total=0;

    cout<<"I will add up the numbers you give me.";
    cout<<"\nNumber: ";
    cin>>number;
    total=number+total;
    cout<<"\nThe total so far is "<<total<<".";

    while(number!=0)
    {
        cout<<"\nNumber: ";
        cin>>number;
        total=number+total;
        cout<<"\nThe total so far is "<<total<<".";
    }
    if(number==0)
    {
        cout<<"\n The total is "<<total<<".";
    }
    return 0;
}