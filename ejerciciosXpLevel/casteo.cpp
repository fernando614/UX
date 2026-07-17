#include <iostream>

using std::cout;
using std::cin;

int main(){

    double numero1;
    cin >> numero1;

    double numero2;
    cin >> numero2;

    int resultado = (int)numero1;
    int resultadoDivisionEntera = (numero2 / 2);
    double resultadoDivisionCasting = (double) (numero2/2);

    cout << "El numero " << numero1 << " convertido a entero es " << resultado;
    cout << "\n";
    cout << "Division entera (" << numero2 << " / " << "2): " << resultadoDivisionEntera;
    cout << "\n";
    cout << "Division con casting (" << "(float)" << numero2 << " / " << "2): " << resultadoDivisionCasting;

    return 0;
}