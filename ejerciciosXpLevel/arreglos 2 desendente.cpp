#include <iostream>

using std::cout;
using std::cin;

int main(){

int numeros[100];

for(int i = 0; i < 100; ++i){
    numeros[i] = i + 1;
}
for(int i = 100; i > 0; --i){
    cout << numeros[i-1] << "\n";
}

    return 0;
}
