#include<iostream>
using namespace std;
int main(){
    int numRow=4; 
    int numCol=4;
    int temp;
    int AR[4][4]={{41, 12, 33, 14}, {15, 46, 17, 68}, {59, 11, 17, 22}, {23, 44, 65, 66}};

    for(int i=0; i<numRow; i++){
        for(int j=0; j<numCol; j++){
            cout<<AR[i][j]<<" ";
        }
        cout<<endl;
    }
    for(int k=0; k<numRow*numCol; k++){
        for(int l=0; l<numRow; l++){
            for(int m=0; m<numCol-1; m++){
                if(AR[l][m]>AR[l][m+1]){
                    temp=AR[l][m];
                    AR[l][m]=AR[l][m+1];
                    AR[l][m+1]=temp;
                }
            }
        }
        for(int o=0; o<numCol; o++){
            for(int p=0; p<numRow-1; p++){
                if(o%2==0){
                    if(AR[p][o]>AR[p+1][o]){
                        temp=AR[p][o];
                        AR[p][o]=AR[p+1][o];
                        AR[p+1][o]=temp;
                    }   
                }else{
                        if(AR[p][o]<AR[p+1][o]){
                            temp=AR[p][o];
                            AR[p][o]=AR[p+1][o];
                            AR[p+1][o]=temp;
                        }
                    }
            }
        }
    }
    cout<<"Array before after sorting by rows!"<<endl;
    for(int i=0; i<numRow; i++){
        for(int j=0; j<numCol; j++){
            cout<<AR[i][j]<<" ";
        }
        cout<<endl;
    }
}