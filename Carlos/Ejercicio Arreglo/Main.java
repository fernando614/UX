public class Main{
   public static void main(String[] args) {
   

      // Arreglo desordenado
      int[] numbers = {10, 2, 0, 5, 9, 9, 10};

  // Se ejecuta (n - 1) veces porque con 6 pasadas un arreglo de 7 elementos queda ordenado
      for (int i = 0; i < numbers.length - 1; i++) {
// Restamos '- i' porque los últimos 'i' elementos YA están en su lugar correcto ordenados.
         for(int j = 0; j < numbers.length - 1 - i; j++) {

         // SI el numero actual es MAYOR al número que tiene a la derecha?
            if(numbers[j] > numbers[j + 1]) {

        //SWAP


       //GUARDAR EL VALOR EN UNA VARIABLE TEMPORAL

               int temp = numbers[j];


       //sobreescribir casilla ACTUAL con el valor del vecino menor
     
               numbers[j] = numbers[j + 1];

       //ponemos el valor guardado en 'temp' dentro de la casilla del vecino 
        
               numbers[j + 1] = temp;


     }

   }
}

      for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}