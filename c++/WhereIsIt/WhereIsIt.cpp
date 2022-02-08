#include<iostream>
#include<ctime>
#include<stdlib.h>
using namespace std;
int main()
{
    srand(time(NULL));
    //int arr[]=new int[10];
    int arr[10];
    int slot=0;
    int value;
    //boolean found=false;
    cout<<"Array: ";
    for(int i=0; i<10; i++)
    {
        arr[i]=rand()%50+1;
        cout<<arr[i]<<"   ";
    }
    cout<<"\nValue to find: ";
    cin>>value;
    for(int j=0; j<10; j++)
    {
        if(arr[j]==value)
        {
            cout<<value<<"is in slot"<<j<<endl;
        }
    }
    return 0;
}