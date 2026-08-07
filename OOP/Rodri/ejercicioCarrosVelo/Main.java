public class Main{
    public static void main(String args[]){
    Car automovil_1 = new Car("rayomquen","tesla",200,"exp20",true);
    Car automovil_2 = new Car("elmencho","ferrari",500,"mateexp",true);
    Car automovil_3 = new Car("bocho","volskwagen",100,"patito",false);
    
        System.out.println("Bienvenidos a la copa piston, veamos como van los automoviles dentro de la carrera");
        System.out.println("El carro que va a la delanter es el poderoso " + automovil_1.name + "con sus poderosos " + automovil_1.caballosFuerza + " caballos de fuerza");
        System.out.println("mientras que el carro con el nombre de " + automovil_3.name + " va muy por detras debido a su debil motor");
        System.out.println("mientras que " + automovil_2 + " va de segundo lugar ");



    }
}

class Car{
    String name;
    String marca;
    int caballosFuerza;
    String motor;
    boolean nitro;


public Car(String name,String marca,int caballosFuerza,String motor,boolean nitro){

    this.name = name;
    this.marca = marca;
    this.caballosFuerza = caballosFuerza;
    this.motor = motor;
    this.nitro = nitro;

    }


}