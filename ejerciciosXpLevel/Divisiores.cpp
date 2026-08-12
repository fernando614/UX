#include <iostream>
using namespace std;

int main() {
    int numero;

    cin >> numero;

    cout << "Sus divisores son: ";

    bool primero = true;

    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            if (!primero) {
                cout << ", ";
            }
            cout << i;
            primero = false;
        }
    }

    return 0;
}