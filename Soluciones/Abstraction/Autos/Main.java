public class Main{
   public static void main(String args[]){
   
      Car bocho = new Car("bochido","volskwagen","HG-10","rojo",30000,false);
      
      System.out.println("El color del bocho es: " + bocho.color);
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
   
   //CONSTRUCTOR
   public Car(String name, String brand, String model, String color, double price, boolean isSafe){
      this.name = name;
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.price = price;
      this.isSafe = isSafe;
   }
}