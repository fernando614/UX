#include <iostream>
using namespace std;

int main() {
    int numero;
    int positivos = 0, negativos = 0;

    while (true) {
        cin >> numero;

        if (numero == 0)
            break;

        if (numero > 0)
            positivos++;
        else
            negativos++;
    }

    cout << "Positivos ";
    for (int i = 0; i < positivos; i++)
        cout << "#";

    cout << endl;

    cout << "Negativos ";
    for (int i = 0; i < negativos; i++)
        cout << "#";

    return 0;
}