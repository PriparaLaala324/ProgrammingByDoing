#include<iostream>
#include<ctime>
using namespace std;
class student{
private:
    string name;
    int age;
    int gradelevel;
    double GPA;
    char gender;
    double grades[4];
public:
    student(string n, int a, int g, char gen){
        name = n;
        age = a;
        gradelevel = g;
        gender = gen;
    }
    void calcGPA(){
        GPA = ((grades[0]+grades[1]+grades[2]+grades[3])/4)*5;
    }
    double getGPA(){
        return GPA;
    }
    void setGrade(string course, double grade){
        if(course=="English"){
            grades[0] = grade;
        }else if(course=="Math"){
            grades[1] = grade;
        }else if(course=="Science"){
            grades[2] = grade;
        }else{
            grades[3] = grade;
        }
    }
    void printGrade(){
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
        cout<<"Gender: "<<gender<<endl;
        cout<<"Grade level: "<<gradelevel<<endl;
        cout<<"English: "<<grades[0]<<endl;
        cout<<"Math: "<<grades[1]<<endl;
        cout<<"Science: "<<grades[2]<<endl;
        cout<<"Social Study: "<<grades[3]<<endl;
        cout<<"GPA: "<<GPA<<endl;
        cout<<"============================\n";
    }
};

int main(){
    srand(time(NULL));
    student std1("Justin Chashao", 16, 10, 'm');

    std1.setGrade("English", rand()%100+1);
    std1.setGrade("Math", rand()%100+1);
    std1.setGrade("Science", rand()%100+1);
    std1.setGrade("Social Study", rand()%100+1);

    student std2("Justin Tenjyuu", 15, 10, 'm');
    std2.setGrade("English", rand()%100+1);
    std2.setGrade("Math", rand()%100+1);
    std2.setGrade("Science", rand()%100+1);
    std2.setGrade("Social Study", rand()%100+1);
    
    std1.calcGPA();
    std1.printGrade();
    std1.getGPA();
    std2.calcGPA();
    std2.printGrade();
    std2.getGPA();
    double s;
    if(std1.getGPA() > std2.getGPA()){
        cout<< endl <<"Student 1 has higher than Student 2.";
        s=std1.getGPA() - std2.getGPA();
    }else if(std1.getGPA() < std2.getGPA()){
        cout << endl <<"Student 2 has higher than Student 1.";
        s=std2.getGPA() - std1.getGPA();
    }else{
        cout<< endl <<"Student 1 and Student 2 equal amount of GPA.";
    }
    
    return 0;
}