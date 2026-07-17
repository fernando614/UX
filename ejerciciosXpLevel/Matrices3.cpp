#include <iostream>
using namespace std;

int main() {
    int matriz[5][5];
    int numero = 1;

    // Llenar la matriz
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            matriz[i][j] = numero;
            numero++;
        }
    }

    // Imprimir la matriz
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }

    // Sumar cada columna
    for (int j = 0; j < 5; j++) {
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            suma += matriz[i][j];
        }

        cout << "Columna " << j + 1 << ": " << suma << endl;
    }

    return 0;
}