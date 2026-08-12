public class Main{
   public static void main(String args[]){
      Stack pila = new Stack(3);
      
      //AGREGAR ELEMENTOS A PILA
      pila.push(10);
      pila.push(2);
      pila.push(5);
      pila.push(20);
      
      //IMPRIMIR PILA
      pila.show();
      
      //SACAR DATO DE LA PILA
      pila.pop();
      pila.pop();
      pila.pop();
      pila.pop();
      
      pila.show();
      
   }
}

class Stack{

   int numbers[];
   int tope;
   
   public Stack(int size){
      this.numbers = new int[size];
   }
   
   //PRIMER METODO PUSH
   public void push(int dato){
   
       if(isFull()){
          System.out.println("Pila Llena!");
       }else{
          numbers[tope] = dato;
          tope = tope + 1;
       }
       
   }
   //SEGUNDO METODO POP
   public int pop(){
      int dato = 0;
      if(isEmpty()){
         System.out.println("Pila Vacia!");
      }else{
         
         dato = numbers[tope-1];
         numbers[tope-1] = 0;
         tope = tope - 1;
      }
      
      
      return dato;
   }
   
   public boolean isEmpty(){
      if(tope == 0){
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