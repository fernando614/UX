#include <iostream>

using std::cout;
using std::cin;

int main(){

   char tablero[3][3] = {
          {'-','-','-'},
			 {'-','-','-'},
			 {'-','-','-'}
			};
   bool jugador_1;	
   bool jugador_2;

   for(int fila=0; fila<3; fila++){
         for(int columna=0; columna<3; columna++){
            cout << tablero[fila][columna];

	 }		
         cout << "\n";

    }
   cout << "\n";
   
   while(true){
   int contador;
   

   jugador_1 = true;
   if(jugador_1){
      contador++;
      int fila;
      int columna;      


      cout << "jugador 1 juegas con las x \n";
      cout << "ingresa una fila jugador 1: \n";
      cin >> fila;

      
      cout << "ingresa una columna jugador 1: \n";
      cin >> columna;

      
      while(tablero[fila][columna] != '-'){

         cout << "esa casilla ya esta ocupada \n";
         cout << "ingresa otra fila: \n";
         cin >> fila;

	 cout << "ingresa otra columna: \n";

         cin >> columna;

	}


      tablero[fila][columna] =  'x';
      jugador_1 = false;
      cout << "\n";
      for(int fila=0; fila<3; fila++){
         for(int columna=0; columna<3; columna++){
            cout << tablero[fila][columna];

	 }		
         cout << "\n";

       }

      //VALIDAR TODAS LAS FILAS
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[0][1] & tablero[0][1] == tablero[0][2]){
         jugador_1 = true;
         break;    
      }	

      if(tablero[1][0] != '-' & tablero[1][0] == tablero[1][1] & tablero[1][1] == tablero[1][2]){
         jugador_1 = true;
         break;    
      }

      if(tablero[2][0] != '-' & tablero[2][0] == tablero[2][1] & tablero[2][1] == tablero[2][2]){
         jugador_1 = true;
         break;    
      }	

      //VALIDAR TODAS LAS COLUMNAS
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[1][0] & tablero[1][0] == tablero[2][0]){
         jugador_1 = true;
         break;    
      }	

      if(tablero[0][1] != '-' & tablero[0][1] == tablero[1][1] & tablero[1][1] == tablero[2][1]){
         jugador_1 = true;
         break;    
      }

      if(tablero[0][2] != '-' & tablero[0][2] == tablero[1][2] & tablero[1][2] == tablero[2][2]){
         jugador_1 = true;
         break;    
      }

      //VALIDAR TODAS DIAGONALES
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[1][1] & tablero[1][1] == tablero[2][2]){
         jugador_1 = true;
         break;    
      }	

      if(tablero[0][2] != '-' & tablero[0][2] == tablero[1][1] & tablero[1][1] == tablero[2][0]){
         jugador_1 = true;
         break;    
      }
      
      if(contador == 9){
         break;
      }



     //TURNO DEL JUGADOR 2:D

     jugador_2 = true;
     if(jugador_2){
      contador++;
      int fila;
      int columna;      


      cout << "jugador 2 juegas con las o \n";
      cout << "ingresa una fila jugador 2: \n";
      cin >> fila;

      
      
      cout << "ingresa una columna jugador 2:\n";
      cin >> columna;

      
      while(tablero[fila][columna] != '-'){

         cout << "esa casilla ya esta ocupada \n";
         cout << "ingresa otra fila: \n";
         cin >> fila;

	 cout << "ingresa otra columna: \n";

         cin >> columna;

	}


      tablero[fila][columna] =  'O';
      jugador_2 = false;
      cout << "\n";
      for(int fila=0; fila<3; fila++){
         for(int columna=0; columna<3; columna++){
            cout << tablero[fila][columna];

	 }		
         cout << "\n";

       }

      //VALIDAR TODAS LAS FILAS
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[0][1] & tablero[0][1] == tablero[0][2]){
         jugador_2 = true;
         break;    
      }	

      if(tablero[1][0] != '-' & tablero[1][0] == tablero[1][1] & tablero[1][1] == tablero[1][2]){
         jugador_2 = true;
         break;    
      }

      if(tablero[2][0] != '-' & tablero[2][0] == tablero[2][1] & tablero[2][1] == tablero[2][2]){
         jugador_2 = true;
         break;    
      }	

      //VALIDAR TODAS LAS COLUMNAS
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[1][0] & tablero[1][0] == tablero[2][0]){
         jugador_2 = true;
         break;    
      }	

      if(tablero[0][1] != '-' & tablero[0][1] == tablero[1][1] & tablero[1][1] == tablero[2][1]){
         jugador_2 = true;
         break;    
      }

      if(tablero[0][2] != '-' & tablero[0][2] == tablero[1][2] & tablero[1][2] == tablero[2][2]){
         jugador_2 = true;
         break;    
      }

      //VALIDAR TODAS DIAGONALES
      if(tablero[0][0] != '-' & tablero[0][0] == tablero[1][1] & tablero[1][1] == tablero[2][2]){
         jugador_2 = true;
         break;    
      }	

      if(tablero[0][2] != '-' & tablero[0][2] == tablero[1][1] & tablero[1][1] == tablero[2][0]){
         jugador_2 = true;
         break;    
      }

	

   }
      

   
} 
 


   }
   if(jugador_1){
     cout << "El juego a terminado y el jugador 1 gano \n";

   }

   if(jugador_2){
     cout << "El juego a terminado y el jugador 2 gano \n";

   }

   if(!jugador_1 & !jugador_2){
     cout << "¡Empate! \n";

   }
   return 0;
}