#include<iostream>
#include<ctime>
#include<stdlib.h>
using namespace std;
int main()
{
    srand(time(NULL));
    int x=rand()%100+1;
    int arr[10];
    int arr1[10];
    cout<<"Array 1: ";
    for(int a=0; a<10; a++)
    {
        int randomnum=rand()%100+1;
        arr[a]=randomnum;
        arr1[a]=randomnum;
    }
    
    arr[9]=-7;
    for(int a=0; a<10; a++)
    {
        cout<<arr[a]<<"     ";
        //cout<<"\n";
    }

    cout<<"\nArray 2: ";
    for(int b=0; b<10; b++)
    {
        cout<<arr1[b]<<"     ";
    }
    return 0;
}