#include <iostream>
using namespace std;
int main()
{
    float bmi, w, h;
    cout<<"Please enter your weight in kg: \n";
        cin>>w;
    cout<<"Please enter your height in m: \n";
        cin>>h;
    bmi=(w)/(h*h);
    cout<<"Your BMI is: \n"<<bmi<<endl;

    return 0;
}