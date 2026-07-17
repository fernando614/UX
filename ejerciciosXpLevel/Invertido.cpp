#include <iostream>
using namespace std;

int main() {
    int numero;
    cin >> numero;

    int decenas = numero / 10;
    int unidades = numero % 10;

    cout << unidades << decenas;

    return 0;
}