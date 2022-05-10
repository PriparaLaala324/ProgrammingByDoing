#include<iostream>
#include<ctime>
using namespace std;

char board[3][3];

void initBoard(){
    for(int r=0; r<3; r++){
        for(int c=0; c<3; c++){
            board[r][c]=' ';
        }
    }
}
void displayBoard(){
    cout<<endl;
    cout<<" 0 "<<board[0][0]<<" |"<<board[0][1]<<"  |"<<board[0][2]<<endl;
    cout<<" ----+---+---"<<endl;
    cout<<" 1 "<<board[1][0]<<" |"<<board[1][1]<<"  |"<<board[1][2]<<endl;
    cout<<" ----+---+---"<<endl;
    cout<<" 2 "<<board[2][0]<<" |"<<board[2][1]<<"  |"<<board[2][2]<<endl;
    cout<<"   0   1   2"<<endl;
}
void displayBoard2(){
    for(int r=0; r<3; r++){
        cout<<"\t"<<r<<" ";
        for(int c=0; c<3; c++){
            cout<<board[r][c]<<" ";
        }
        cout<<"\n";
    }
    cout<<"\t 0 1 2";
}
void playChoice(char player){
    int row, column;
    cout<<player<<",choose your location(row, column): ";
    cin>>row;
    cin>>column;
    board[row][column]=player;
}
bool winGame(char player)
{
    for(int r=0; r<3; r++)
    {
          if ( (player == board[r][0]) && (board[r][0] == board[r][1]) && (board[r][1] == board[r][2]))
            return true;
    }
    for(int c=0; c<3; c++){
        if((player==board[0][c])&&(board[0][c]==board[1][c])&&(board[1][c]==board[2][c])){
            return true;
        }
    }
    if((player==board[0][0])&&(board[0][0]==board[1][1])&&(board[1][1]==board[2][2])){
        return true;
    }
    else if((player==board[0][2])&&(board[0][2]==board[1][1])&&(board[1][1]==board[2][0]))
        return true;

    return false;
   // }
}
int main()
{
    char p1='X';
    char p2='O';
    int turn=1;
    initBoard();
    displayBoard();
    while(true)
    {
        cout<<"Turn"<<turn<<"...";
        if(turn%2 !=0)
        {
            playChoice(p1);
            turn++;
        }
        else
        {
            playChoice(p2);
            turn++;
        }
        displayBoard();
        if(winGame(p1)){
            cout<<""<<p1<<" wins the game!"<<endl;
            break;
        }
        else if(winGame(p2)){
            cout<<""<<p2<<" wins the game!"<<endl;
            break;
        }
        else if(turn>9){
            cout<<"This game is a tie."<<endl;
            break;
        }
    }
}
