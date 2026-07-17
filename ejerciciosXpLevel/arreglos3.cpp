#include <iostream>
using std::cout;
using std::cin;

int main(){

    int element;
    int elements[10];
   
    for(int i = 0; i < 10; i++){
        cin>>element;
        elements[i] = element;
    }

    int sum=0;
    int difference=elements[0];
    int mul = 1;
    double average=0.0;

    for(int i = 0; i < 10; i++){
        if (i > 0) {
            difference -= elements[i];
        }
        sum += elements[i];
        mul *= elements[i];
    }

    average = sum/10.00;

    cout <<"Suma: " << sum;
    cout<<"\n";
    cout <<"Resta: " << difference;
    cout<<"\n";
    cout <<"Multiplicacion: " << mul;
    cout<<"\n";
    cout <<"Promedio: " << average;
    return 0;
}