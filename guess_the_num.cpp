#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
    int ci;
    int ui;
    int gss = 0;
    srand((unsigned)time(0));
    ci = (rand() % 100) + 1;
    // cout << ci << "\n";

    while (ui != ci)
    {
        cout << "\nguess the number: ";
        cin >>ui;
        gss++;

        if (ui == ci)
        {
            cout << "You guess it right";
        }
        else if (ci > ui)
        {
            cout << "Choose big num";
        }
        else if (ci < ui)
        {
            cout << " Choose small num";
        }
       
    }
    cout << " you guess it in " << gss <<" times" ;
    return 0;
}
