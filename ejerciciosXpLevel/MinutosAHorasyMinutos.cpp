#include <iostream>
using namespace std;

int main() {
    int minutos;
    cin >> minutos;

    int horas = minutos / 60;
    int resto = minutos % 60;

    cout << horas << " horas y " << resto << " minutos";

    return 0;
}