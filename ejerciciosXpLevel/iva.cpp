#include <iostream>
using std::cout;
using std::cin;

int main(){

    int unidadesArticulo;
    cin >> unidadesArticulo;

    int precio;
    cin >> precio;

    double iva = 0.15;
     
    double totalVenta = (unidadesArticulo * precio);
    double totalVentaConIva = (totalVenta * iva) + totalVenta;
    
    if(totalVentaConIva > 1000){
        totalVentaConIva = totalVentaConIva * 0.95;
    }

    cout << "Pagar $" << totalVentaConIva;
    
    

    return 0;
}