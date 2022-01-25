#include <iostream>
#include<cmath>
using namespace std;
double distance(int x1, int y1, int x2, int y2);
double dist;
int main()
{
    double d1=distance(-2, 1, 1, 5);
    cout<<"\n(-2,1) to (1,5) => "<<d1;
    double d2=distance(-2,-3,-4,4);
    cout<<"\n(-2,-3) to (-4,4) => "<<d2;
    cout<<"\n(2,-3) to (-1,-2) => "<<distance(2, -3, -1,-2);
    cout<<"\n(4,5) to (4,5) => "<<distance(4,5,4,5);
}
double distance(int x1, int y1, int x2, int y2)
{
    dist = sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    return dist;
}