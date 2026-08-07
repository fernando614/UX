public class Main{
   public static void main(String args[]){
   
      Car bocho = new Car("bochido","volskwagen","HG-10","rojo",30000,false);
      Car audi = new Car("audi","volskwagen","HG-10","rojo",30000,false);
      Car tesla = new Car("tesla","volskwagen","HG-10","rojo",30000,true);

      Car [] cars = new Car[3];
      cars[0] = bocho;
      cars[1] = audi;
      cars[2] = tesla;


      Car car =  new Car();
      car.filteredSafeCars(cars);
      
      /*System.out.println("El color del bocho es: " + bocho.color);*/
   }
}

class Car{

   //VARIABLES DE INSTANCIA
   String name;
   String brand;
   String model;
   String color;
   double price;
   boolean isSafe;
   
   //CONSTRUCTOR VACÍO
   public Car(){}
   //CONSTRUCTOR
   public Car(String name, String brand, String model, String color, double price, boolean isSafe){
      this.name = name;
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.price = price;
      this.isSafe = isSafe;
   }

   public void filteredSafeCars(Car [] cars){

      for(Car car: cars){
         if(car.isSafe){
            System.out.println("Carro " + car.name + " listo para venderse");
         }
      }
   }

}