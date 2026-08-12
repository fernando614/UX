public class Tesla {
public static void main(String args[]) {

   //INSTANCE
  
   Car tesla = new Car("Model S", "Tesla", "Red", true);
   
   //VARIABLE & METHODS
   
   tesla.accelerate();
   
   
 

   }
}

class Car{

   //ATRIBUTES 
   
   String name;
   String brand;
   String color;
   boolean isSafe;
   
   //METHOD CONSTRUCTOR
   
   public Car(String name, String brand, String color, boolean isSafe) {
      this.name = name;
      this.brand = brand;
      this.color = color;
      this.isSafe = isSafe;
   }

   //METHODS
   
   void accelerate(){
      System.out.println(brand + " is accelerating.");
   }
 
   }