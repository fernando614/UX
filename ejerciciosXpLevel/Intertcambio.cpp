#include <iostream>
using namespace std;

int main() {
    int A, B, aux;

    cin >> A >> B;

    aux = A;
    A = B;
    B = aux;

    cout << "A: " << A << ", B: " << B;

    return 0;
}