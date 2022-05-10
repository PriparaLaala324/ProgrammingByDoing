#include<iostream>
using namespace std;
int main(){
    int pc1, pc2;
    int dc1, dc2;
    int newc;
    int pt, dt;
    int wallet=500, wager;
    string replay;
    string choice;

    cout<<"Welcome to Sharon's blackjack program!";
    do{
    cout<<"\nNow taking bets for the next hand of blackjack";
    cout<<"\nYou currently have $ "<<wallet;
    do{
        cout<<"\nHow much do you put down (min: $5, max: $100, increments of 5): ";
        cin>>wager;
        if(wager<1 || wager>100 || wager>wallet || wager%5!=0){
            cout<<"You cannot bet $ "<<wager<<". Please try again";
        }
    }while (wager<1 || wager>100 || wager>wallet || wager%5!=0);
    srand(time(NULL));
    pc1=(rand()%10)+2;
    pc2=(rand()%10)+2;
    pt=pc1+pc2;
    dc1=(rand()%10)+2;
    dc2=(rand()%10)+2;
    dt=dc1+dc2;

    cout<<"\nYou get a "<<pc1<<" and a "<<pc2;
    cout<<"\nYour total is "<<pt;
    cout<<"\nThe dealer has a "<<dc1<<" showing, and a hidden card";
    cout<<"\nHer total is hidden, too";

    do{
        cout<<"\nWould you like to hit or stay: ";
        cin>>choice;
        if(choice =="hit"){
            
            newc=(rand()%10)+2;
            cout<<"\nYou drew a "<<newc;
            pt+=newc;
            cout<<"\nYour total is "<<pt;
        }
    }while(pt<=21 && (choice!="stay"));

    if(pt<=21){
        cout<<"\nOkay, dealer's turn";
        cout<<"\nHer hidden card was a "<<dc2;
        cout<<"\nHer total was "<<dt;

        do{
            if(dt<17){
                choice="hit";
                cout<<"\nDealer chooses to hit";
                newc=(rand()%10)+2;
                cout<<"\nShe draws a "<<newc;
                dt+=newc;
                cout<<"\nHer total is "<<dt;
            }
            else{
                choice="stay";
                cout<<"\nDealer stays";
            }
        }while(dt<=21 && (choice!="stay"));
    }
    cout<<"\nDealer's total is "<<dt;
    cout<<"\nYour total is "<<pt;

    if(pt<=21){
        if(dt<=21){
            if(pt>dt){
                cout<<"\nYOU WIN!";
                wallet+=wager;
            }
            else if(pt==dt){
                cout<<"\nYou Drew";
            }
            else{
                cout<<"\nYou Lose";
                wallet-=wager;
            }
        }
        else{
            cout<<"\nYOU WIN!";
            wallet+=wager;
        }
    }
    else{
        cout<<"\nYou Lose";
        wallet-=wager;
    }
    if(wallet<=0){
        cout<<"\nYou've run out of money. Better luck next time!";
        break;
    }
    cout<<"\nYou now have $ "<<wallet;
    cout<<"\nCare to play again (y/n): ";
    cin>>replay;
}while(replay!="n");
}