public class Main{
   public static void main(String args[]){
    Stack pila = new Stack(5);
   
   //Agregar elementos de pila
   pila.push(29);
   pila.push(52);
   pila.push(10);
   pila.push(777);
   pila.push(25);
   
   //Imprimir pila
   pila.show();
   
   //Sacar dato de la pila
    pila.pop();
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


    //Primer metodo push
   
public void push(int dato){
    
    if(isFull()){
        System.out.println("La pila esta llena!");
    }else{
       numbers[tope] = dato;
       tope = tope + 1;
    
    }

}
    //Segundo metodo POP

public int pop(){
    int dato = 0;
    if(isEmpty()){
        System.out.println("Pila vacia!");
    }else{
    
        dato = numbers[tope-1];
        numbers[tope-1] = 0;
        tope = tope - 1;
        
}


    return dato;   

}

public boolean isEmpty(){
    if(tope <= 0){
        return true;
    }
    return false;
} 

public boolean isFull(){
    int len = numbers.length;
    if(tope >=    len){
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