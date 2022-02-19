#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;
int main(){
    int ci;
    int ui;
    int gss = 0;
    srand((unsigned)time(0));
    ci = (rand()%100)+1; 
    cout << ci << "\n"; 
    
    while (ui!=ci)
{
    printf("\nguess the number: ");
    scanf("%d", &ui);
    gss++;

    if (ui == ci)               
    {
        printf("You guess it right");
    }
    else if (ci > ui)
    {
        printf("Choose big num");
    }
    else if (ci<ui)
    {
        printf("Choose small num");
    } 
printf("  you guess it in %d times", gss);
return 0;
}
}