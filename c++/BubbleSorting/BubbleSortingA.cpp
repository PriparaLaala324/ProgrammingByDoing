#include <iostream>
#include <stdlib.h>
#include <ctime>
using namespace std;
int main()
{
    srand(time(NULL));
    int arr[10];
    int i=0;
    int random=0;
    int size=sizeof(arr)/sizeof(arr[0]);

    for (int i=0; i<size; i++)
    {
        random=rand()%100+1;
        arr[i]=random;
    }
    cout<<"Before: ";

    for(i=0; i<size; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    for (int x=0; x<size; x++)
    {
        for (int y=0; y<size; y++)
        if(arr[y]>arr[y+1])
        {
            int temp=arr[y];
            arr[y]=arr[y+1];
            arr[y+1]=temp;
        }
    }

    cout<<"After: ";
    for (i=0; i<size; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}