#include<iostream>
#include<cmath>
using namespace std;

class Quadrilateral{
private:
string Type;
double Area;
public:
    Quadrilateral(){}
    Quadrilateral(int x){
        cout<<x*x<<endl;
        Area=x*x;
        Type="square";
    }
    Quadrilateral(int w, int h){
        cout<<w*h<<endl;
        Type="rectangle";
    }
    Quadrilateral(int b1, int b2, int h){
        cout<<((b1+b2)*h)/2<<endl;
        Type="trapezoid";
    }
    double getArea(){
        return Area;
    }
    string getType(){
        return Type;
    }
};
int main(){
    Quadrilateral shape1(5);
    cout<<shape1.getType()<<endl;
    Quadrilateral shape2(5, 4);
    cout<<shape2.getType()<<endl;
    Quadrilateral shape3(2, 6, 4);
    cout<<shape3.getType()<<endl;
    return 0;
}