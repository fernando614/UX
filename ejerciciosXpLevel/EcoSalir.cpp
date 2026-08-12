#include <iostream>
#include <string>
using namespace std;

int main() {
    string palabra;

    while (cin >> palabra) {
        if (palabra == "salir") {
            break;
        }
        cout << palabra << endl;
    }

    return 0;
}