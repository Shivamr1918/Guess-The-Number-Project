#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
int ci;
int ui;
int gss = 0;

srand(time(0));
ci = rand()%100 + 1;
printf("%d", ci);
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

}

printf(" it was %d you guess it in %d times", ci, gss);

return 0;
}
