#include <iostream>
using namespace std;
int main()
{
    float height, weight, bmi;
    cout<<"Your height in m: \n";
    cin>>height;
    cout<<"\nYour weight in kg: \n";
    cin>>weight;
    bmi=weight/(height*height);
    cout<<"\nYour BMI is "<< bmi;
    if (bmi<18.5)
    {
        cout<<"BMI Category: underweight";
    }
    else if (bmi>=18.5; bmi<=24.9)
    {
        cout<<"BMI Category: normal weight";
    }
    else if (bmi>=25.0; bmi<=29.9)
    {
        cout<<"BMI Category: overweight";
    }
    else
    {
        cout<<"BMI Category: obese";
    }
    return 0;
}