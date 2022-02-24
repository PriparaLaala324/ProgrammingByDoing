#include<iostream>
#include<list>
using namespace std;
class Dog{
private:
    int age;
    double weight;   
public:
Dog(int a, double w){
    age = a;
    weight = w;
}

void Getinfo(){
    cout<<"Age: "<<age<<endl;
    cout<<"Weight: "<<weight<<endl;
}
};


int main(){
    Dog dog1(2, 14.35);
    dog1.Getinfo();

    return 0;
}