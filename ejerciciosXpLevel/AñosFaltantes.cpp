#include <iostream>
using namespace std;

int main() {
    int actual, otro;
    cin >> actual >> otro;

    if (otro <= actual)
        cout << "Han pasado " << actual - otro << " agnos";
    else
        cout << "Faltan " << otro - actual << " agnos";

    return 0;
}