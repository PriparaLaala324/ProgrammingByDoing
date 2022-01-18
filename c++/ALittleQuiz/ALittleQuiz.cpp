#include <iostream>
using namespace std;
int main()
{
    int Q1, Q2, Q3, score;
    string y;
    cout << "\nAre you ready for a quiz?";
    cin >> y;
    cout << "\nOkay, here it comes!";
    cout << "\nQ1) What is the captital of ";
    cout << "\n     1) Melbourne";
    cout << "\n     2) Anchorage";
    cout << "\n     3) Juneau\n";
    cin >> Q1;
    if (Q1 == 3)
    {
        cout << "\nThat's right!";
        score++;
    }
    else
    {
        cout << "\nSorry, that's not the right answer. The answer is 3";
    }
    cout << "\nQ2) Can you store the value cat in a variable of type int?";
    cout << "\n     1) yes";
    cout << "\n     2) no\n";
    cin >> Q2;
    if (Q2 == 2)
    {
        cout << "\nThat's right!";
        score++;
    }
    else
    {
        cout << "\nSorry, that's not the right answer. The answer is 1";
    }
    cout << "\nQ3) What is the result of 9+6/3?";
    cout << "\n     1) 5";
    cout << "\n     2) 11";
    cout << "\n     3) 15/3\n";
    cin >> Q3;
    if (Q3 == 2)
    {
        cout << "\nThat's right!";
        score++;
    }
    else
    {
        cout << "\nSorry, that's not the right answer. The answer is 2";
    }

    cout << "\nOverall, you got " << score << "out of 3 correct.";
    cout << "Thanks for playing!";
    return 0;
}