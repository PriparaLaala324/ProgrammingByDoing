#include<iostream>
using namespace std;
int *largest;
int main(){
    srand(time(NULL));
    int arr[10];
    largest=&arr[0];

    cout<<"Array: ";
    for(int i=0; i<10; i++){
        int indexA = rand()%100+1;
        arr[i]= indexA;
        cout<<*(i+largest)<< " ";
    }
    for(int i=0; i<10; i++){
        if(*largest<*(largest+i)){
            *largest=*(largest+i);
            }
        else{
            *largest = *largest;
        }    
    }
    cout<<"\nThe largest value is "<<*largest<<endl;
return 0;
}