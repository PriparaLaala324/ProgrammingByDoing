#include<iostream>
#include<cmath>
using namespace std;

class Quadrilateral{
private:
double area;
string type;
public:
    Quadrilateral(){}
    Quadrilateral(int x){
        area=x*x;
        type="square";
    }
    Quadrilateral(int w, int h){
        area=w*h;
        type="rectangle";
    }
    Quadrilateral(int b1, int b2, int h){
        area=((b1+b2)*h)/2;
        type="trapezoid";
    }
    double getArea(){
        return area;
    }
    string getType(){
        return type;
    }
    double changeShape(int x){
        return area=x*x;
    }
    double changeShape(int w, int h){
        return area=w*h;
    }
    double changeShape(int b1, int b2, int h){
        return area=((b1+b2)*h)/2;
    }
};

int main(){
    Quadrilateral shape[3]={Quadrilateral(6), Quadrilateral(6, 5), Quadrilateral(3, 6, 5)};
    Quadrilateral square[3];
    for(int i=0; i<3; i++){
        square[i]=Quadrilateral(i+5);
    }
    cout<<"Shape Area: "<<shape[0].getArea()+shape[1].getArea()+shape[2].getArea()<<endl;
    cout<<"Square Area: "<<square[0].getArea()+square[1].getArea()+square[2].getArea()<<endl;
    cout<<"Total: "<<shape[0].getArea()+shape[1].getArea()+shape[2].getArea()+square[0].getArea()+square[1].getArea()+square[2].getArea()<<endl;
}