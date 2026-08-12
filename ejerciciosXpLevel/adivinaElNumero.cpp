#include <iostream>
using std::cout;
using std::cin;

int main(){
    
    int secretNumber;
    int guessNumber;

    cin >> secretNumber;
    cin >> guessNumber;

    while(true){
        if(secretNumber == guessNumber){
            break;
        }
        else if (guessNumber < secretNumber){
            cout << "menor\n";
        }else{
            cout << "mayor\n";
        }
        cin >> guessNumber;
    }
    
    cout<<"Adivinaste\n";
    return 0;
}