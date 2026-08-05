public class Main{
   public static void main(String args[]){
   Stack pila = new Stack(4);
   
   
   //ELEMENTOS PILA//
   pila.push(2);
   pila.push(3);
   pila.push(4);
   pila.push(5);
   
   //imprimir pila
   pila.show();
   
   //SACAR DATOS
   pila.pop();
   pila.pop();
   pila.pop();
   pila.pop();
   
   pila.show();
   
   
  }
}

class Stack{


   // agregamos el arreglo y el tope (atributos)
   int numbers[];
   int tope; 
   
   //Constructor RECUERDALO
   public Stack(int size){
      this.numbers = new int[size];
   }


   // PRIMER PUSH (metodo)
   public void push(int dato){
   
      if(isFull()){
         System.out.println("PILA LLENA!");
      } else {
         numbers[tope] = dato;
         tope++;
      }
   }
   
   
   //SEGUNDO METODO POP
   public int pop() {
      int dato = 0;
      if(isEmpty()) {
         System.out.println("PILA VACIA!");
      } else {
      
       dato = numbers[tope-1];
         numbers[tope-1] = 0;
         tope = tope - 1;
      }
      return dato;
   }
   
   public boolean isEmpty() {
      if(tope== 0) {
         return true;
      }
         return false;
   }
   public boolean isFull(){
     int len = numbers.length;
     if(tope == len){
        return true;
     }
     return false;
   }

   public void show(){
      System.out.println();
      for(int number: numbers){
         System.out.print(number + " ");
     }
   }
}