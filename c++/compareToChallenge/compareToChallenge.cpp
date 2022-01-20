#include <iostream>
using namespace std;
int main()
{
    string a = "axe";
    string b = "dog";
    string c = "applebee's";
    string d = "apple";
    cout<<"Comparing \"axe\" with \"dog\"produces";
    int i = a.compare(b);
    cout<<i;

    cout<<"\nComparing \"applebee's\" with \"apple\" produces";
    cout<<c.compare(d);
    return 0;
}