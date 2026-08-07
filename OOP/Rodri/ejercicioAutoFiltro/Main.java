public class Main{
   public static void main(String args[]){
    
   Car bocho = new Car("bocho",true);
   Car Tsuru = new Car("Tsuru",false);
   Car Ferrari = new Car("Ferrari",true);


   Car cars[] = new Car[3];

   cars[0] = bocho;
   cars[1] = Tsuru;
   cars[2] = Ferrari;
   
   Car car = new Car();
   car.safeCars(cars);


   }

}

class Car{
  
   String name;
   boolean isSafe;

public Car(){}
   		

public Car(String name,boolean isSafe){

   this.name = name;
   this.isSafe = isSafe;

}
//el void te permite hacer algo no devuelve nada
   public void safeCars(Car []cars){
   for(int i = 0; i < cars.length; i++){
      if(cars[i].isSafe){  //esta buscando dentro de la posición del arreglo autos
          System.out.println("El carro " + cars[i].name + "esta listo para venderse.");
      }
   }

    
   }
}