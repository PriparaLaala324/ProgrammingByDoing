#include <iostream>
using namespace std;
int main()
{
    string gender, Fn, Ln, marriage;
    int age;
    cout<<"What is your gender (M or F): ";
    cin>>gender;
    if (gender=="M")
    {
        cout<<"\nFirst name: ";
        cin>>Fn;
        cout<<"\nLast name: ";
        cin>>Ln;
        cout<<"\nAge: ";
        cin>>age;
        if (age>=20)
        {
            cout<<"\n\nAre you married, "<<Fn<<"(y or n)? ";
            cin>>marriage;
            if (marriage=="y")
            {
                cout<<"\nThen I shall call you Mrs. "<<Ln;
            }
            else if (marriage=="n")
            {
                cout <<"\nThen I shall call you Mr."<<Ln;
            }
        }
        else if (age<20)
        {
            cout<<"\nThen I shall call you"<<Fn<<" "<<Ln;
        }
    }
    else if(gender=="F")
    {
        cout<<"\nFirst name: ";
        cin>>Fn;
        cout<<"\nLast name: ";
        cin>>Ln;
        cout<<"\nAge: ";
        cin>>age;
        if (age>=20)
        {
            cout<<"\n\nAre you married, "<<Fn<<"(y or n)? ";
            cin>>marriage;
            if (marriage=="y")
            {
                cout<<"\nThen I shall call you Mrs. "<<Ln;
            }
            else if (marriage=="n")
            {
                cout <<"\nThen I shall call you Ms."<<Ln;
            }
        }
        else if (age<20)
        {
            cout<<"\nThen I shall call you "<<Fn<<" "<<Ln;
        }
    }
    return 0;
}