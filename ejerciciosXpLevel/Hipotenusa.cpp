#include <iostream>
#include <cmath> // Necesario para std::sqrt

int main() {
    double cateto1, cateto2;

    // Leer los dos catetos
    std::cin >> cateto1 >> cateto2;

    // Calcular la hipotenusa
    double hipotenusa = std::sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

    // Mostrar el resultado
    std::cout << "Hipotenusa: " << hipotenusa << std::endl;

    return 0;
}

