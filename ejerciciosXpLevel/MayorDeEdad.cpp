#include <iostream>

int main() {

    int edad;
    std::cin >> edad;

    if (edad >= 18) {
        std::cout << "Eres Mayor" << std::endl;
    } else {
        std::cout << "No eres Mayor" << std::endl;
    }

    return 0;
}