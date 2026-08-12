public class Main{
   public static void main(String args[]){
   
      //CREO MIS OBJETOS
      Car bocho = new Car("bochido","volskwagen","HG-10","rojo",30000,false);
      Car audi = new Car("audi","volskwagen","HG-10","rojo",30000,false);
      Car tesla = new Car("tesla","volskwagen","HG-10","rojo",30000,true);


      //INICIALIZO MI ARREGLO
      Car [] cars = new Car[3];
      //ASIGNO VALORES
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

      //FOR MEJORADO SIRVE PARA COLLECCIONES
      /*for(Car car: cars){
         if(car.isSafe){
            System.out.println("Carro " + car.name + " listo para venderse");
         }
      }*/

         //FOR TRADICIONAL SIRVE PARA TODO
         for(int i = 0; i < cars.length; i++){
            if(cars[i].isSafe){
               System.out.println("Carro " + cars[i].name + " listo para venderse");
            }
         }
   }

}