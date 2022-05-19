#include<iostream>
#include<list>
#include<cmath>
#include<ctime>
using namespace std;
int main(){
    srand((unsigned)time(0));
    int c;
    int r;

    cout<<"Welcome to the Alphabet Sorter!"<<endl;
    cout<<"Enter Size(enter 0 0 to exit): ";
    cin>>c;
    cin>>r;
    char a[r][c];
    cout<<"Generated Array: "<<endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            int r=rand()%25+'a';
            char ch=char(r);
            a[i][j]=ch;
            cout<<a[i][j]<<" ";
        }
        cout<<endl;
    }
}