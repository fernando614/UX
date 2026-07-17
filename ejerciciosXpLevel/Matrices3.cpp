#include <iostream>
using namespace std;

int main() {
    int numeros[10];
    int suma = 0;
    int resta;
    int multiplicacion = 1;
    double promedio;

    // Leer los 10 números
    for (int i = 0; i < 10; i++) {
        cin >> numeros[i];
    }

    // Inicializar la resta con el primer elemento
    resta = numeros[0];

    // Calcular suma, multiplicación y resta
    for (int i = 0; i < 10; i++) {
        suma += numeros[i];
        multiplicacion *= numeros[i];

        if (i > 0) {
            resta -= numeros[i];
        }
    }

    // Calcular el promedio
    promedio = (double)suma / 10;

    // Mostrar resultados
    cout << "Suma: " << suma << endl;
    cout << "Resta: " << resta << endl;
    cout << "Multiplicacion: " << multiplicacion << endl;
    cout << "Promedio: " << promedio << endl;

    return 0;
}