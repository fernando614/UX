#include <iostream>
using namespace std;

int main() {
    int base, altura;
    cin >> base >> altura;

    int perimetro = 2 * (base + altura);
    int area = base * altura;

    cout << "Perimetro: " << perimetro << ", Area: " << area;

    return 0;
}