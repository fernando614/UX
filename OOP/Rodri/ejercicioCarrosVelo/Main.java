public class Main{
   public static void main(String args[]){
   Car nascar = new Car("RayoMaqueen","nascar","2019","rayoZX");
   Car ferrari = new Car("Franchesco","ferrari","2020","frech2000");   
    
    /*"Al escribir el nombre del objeto seguido de un punto y el nombre de la función (ej. nascar.Acelerar),
     estamos llamando (ejecutando) ese método. Lo que va dentro de los paréntesis son los argumentos: los,
     datos que le enviamos a la función para que trabaje con ellos."*/

     nascar.datosCar(nascar.name,nascar.marca,nascar.ano,nascar.modelo);
     nascar.Acelerar(nascar.name);
      
     System.out.println();

     /*MÉTODO ESTA BIEN PERO SE PUEDE REFACTORIZAR hola
     
     ferrrari.datosCar(); -> SOLO NECESITO LLAMAR AL MÉTODO YA QUE LOS VALORES SE LOS PASE AL CONSTRUCTOR POR LO TANTO NO TENGO QUE PASAR NADA COMO PARÁMETRO
     */

     ferrari.datosCar(ferrari.name,ferrari.marca,ferrari.ano,ferrari.modelo);//LOS VALORES YA FUERON PASADOS POR EL CONSTRUCTOR ES COMO SI VUELVES A PASAR ASI MISMO DE NUEVO
     ferrari.NoAcelerando(ferrari.name);	
      
      }
   
   }
   
   
class Car{
   String name;
   String marca;
   String ano;
   String modelo;

/*la única razón por la que Car no lleva tipo de retorno es porque es un constructor
(tiene el mismo nombre que la clase). Acelerar no es un constructor, así que sí necesita void.*/


public Car(String name,String marca,String ano,String modelo){
   
   this.name = name;
   this.marca = marca;
   this.ano = ano;
   this.modelo = modelo;   
}   
 
/*Todo método en Java (que no sea constructor) necesita declarar qué tipo de dato devuelve,
aunque no devuelva nada. Si no devuelve nada, se usa void.*/	

public void Acelerar(String name){
   
   System.out.println( name + " esta acelerando!!!");
      
   }

public void NoAcelerando(String name){
 
   System.out.println( name + " no esta acelerando!!!!!");   
 
   }

/*podemos archivar informacion en este public void datosCar, de esta manera se puede ver mas,
limpio el codigo, sin tantos println arriba,*/


public void datosCar(String name,String marca,String ano,String modelo){
    System.out.println("---Auto---");
    System.out.println("Nombre: " + name);
    System.out.println("marca: " + marca);
    System.out.println("año: " + ano);
    System.out.println("modelo: " + modelo);

   }   

   /*MÉTODO datosCar() CORREGIDO 
   public void datosCar(){
    System.out.println("---Auto---");
    System.out.println("Nombre: " + name);
    System.out.println("marca: " + marca);
    System.out.println("año: " + ano);
    System.out.println("modelo: " + modelo);

   }  */

}   