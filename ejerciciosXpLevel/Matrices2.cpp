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

    // Sumar cada fila
    for (int i = 0; i < 5; i++) {
        int suma = 0;

        for (int j = 0; j < 5; j++) {
            suma += matriz[i][j];
        }

        cout << "Fila " << i + 1 << ": " << suma << endl;
    }

    return 0;
}