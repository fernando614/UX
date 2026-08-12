#include <iostream>
using namespace std;

int main() {

    int num1, num2;
    int suma = 0;

    cin >> num1 >> num2;

    for (int i = num1 + 1; i < num2; i++) {
        suma += i;
    }

    cout << "La suma es " << suma;

    return 0;
}