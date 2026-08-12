#include <iostream>
using namespace std;

int main() {
    char letra;
    cin >> letra;

    switch (letra) {
        case 'A': cout << 9; break;
        case 'B': cout << 8; break;
        case 'C': cout << 7; break;
        case 'D': cout << 6; break;
        case 'E': cout << 5; break;
        case 'F': cout << 4; break;
        default: cout << "No existe";
    }

    return 0;
}