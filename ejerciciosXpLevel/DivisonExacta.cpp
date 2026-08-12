#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    if (a % b == 0)
        cout << "La division es exacta";
    else
        cout << "La division NO es exacta";

    return 0;
}