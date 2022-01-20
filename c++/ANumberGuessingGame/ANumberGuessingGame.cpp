//Random number in c++
#include <iostream>
#include <ctime>
#include <stdlib.h>
using namespace std;
int main()
{
    srand(time(NULL));
    int randomnum = rand()%10+1;
    int num;
    cout<<"I'm thinking of a number from 1 to 10.\n";
    cin>>num;
    if (num==randomnum)
    {
        cout<<"That's right! My secret number was "<<randomnum;
    }
    else
    {
        cout<<"Sorry, but I was really thinking of "<<randomnum;
    }

}