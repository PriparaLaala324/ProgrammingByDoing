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
        cout<<*(i+largest)<<" ";
    }
    int *loc;
    for(int i=0; i<10; i++){
        if(*largest<*(largest+i)){
            *largest=*(largest+i);
            *loc=i;
        }
        else{
            *largest = *largest;
        }    
    }
    cout<<"\nThe largest value is at the "<<*loc<<endl;
return 0;
}