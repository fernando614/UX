#include <iostream>

using std::cout;
using std::cin;
using std::endl;

int main(){

   int arreglo1[4] = {5,3,2,7};

   //cout << arreglo1[2];

   /*for(int i = 0; i < 4; i++){
      cout << arreglo1[i];
   }
   cout << "\n";
   cout << "fuera del loop";*/

   int arreglo2[3][4] = {
                           {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                        };

   /*cout << arreglo2[1][2];//7
   cout << arreglo2[0][1];//2
   cout << arreglo2[2][3];//12*/

   for(int fila = 0; fila < 3; fila++){
      for(int columna = 0; columna < 4; columna++){
         cout << arreglo2[fila][columna] << " " ;
      }
      cout << "\n";
   }
   
   
   return 0;
}