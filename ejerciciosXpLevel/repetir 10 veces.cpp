#include <iostream>

using std::cin;
using std::cout;
using std::string;

int main(){
string palabra;

if(cin >> string){
    for(int i = 0; i < 10; ++i)
    cout << string << "\n";
}
    return 0;
}