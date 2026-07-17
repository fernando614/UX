#include <iostream>

using std::cin;
using std::cout;

int main(){

    int entrada;
    cin >> entrada;

    int sum = entrada += 2;
    int resta = entrada -= 2;
    int mul = entrada *= 2;
    int div = entrada = entrada / 2; 

    cout << "Despues de += 2: "  << sum << "\n";
    cout << "Despues de -= 2: "  << resta << "\n";
    cout << "Despues de *= 2: "  << mul << "\n";
    cout << "Despues de /= 2: "  << div <<"\n";
    

    return 0;
}