public class Main{
    public static void main(String args[]){
        Car tsuru = new Car("Tsuru","Temu","2000","blue",40000,true,true);    
        System.out.println("La marca del: " + tsuru.name + " es " + tsuru.brand);
	System.out.println("El modelo " + tsuru.name + " es rapido? " + tsuru.isFast);
	System.out.println("Cual es la marca mas cara del modelo " + tsuru.name + tsuru.modelo);
	System.out.println("El modelo " + tsuru.name + " " + tsuru.modelo + " es seguro? " + tsuru.isSafe);
    }
}       


class Car{

    String name;
    String brand;
    String modelo;
    String color;
    double price;
    boolean isSafe;
    boolean isFast;



public Car(String name,String brand,String modelo,String color,double price,boolean isSafe,boolean isFast){

    this.name = name;
    this.brand = brand;
    this.modelo = modelo;
    this.color = color;
    this.price = price;
    this.isSafe = isSafe;
    this.isFast = isFast;

   }  
}