#include <iostream>
#include <string>

using namespace std;
void sayHello(string name){
    cout<<"Hello "<<name;
}
void sayHi(string &name){
    //&name means the address of "name"
    cout<<"Hi "<<name;
}

int * larger(int *x, int *y){
    //purpose of this is to do a comparsion of a and b in the int main
    if(*x>*y) return x;
    else return y;
}

int main()
{
    string name = "World";
    sayHello(name);
    cout<<endl;
    //tell the computer to print out "Hello World"
    
    string *pName = &name;
    sayHi(*pName);
    //print out "Hi World" by the address of "name" 
    int a = 5;
    int b = 1;
    int *pNum = larger(&a,&b);
    //the result of comparsion from larger
    cout<<"\n"<<*pNum<<" is larger"<<endl;
    return 0;
}