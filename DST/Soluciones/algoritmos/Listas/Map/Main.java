import java.util.*;
public class Main{
   public static void main(String...x){
   
      //CREO MAPA/diccionario
      HashMap<Integer,Product> map = new HashMap<Integer,Product>();
      
      map.put(1,new Product("laptop",1200));
      map.put(2,new Product("mouse",200));
      map.put(3,new Product("monitor",12000));
      
      
      System.out.println("=== DICCIONARIO ===");
      //Recorro el diccionario y guarda cada llave de mi diccionario
      for(int key:map.keySet()){
         System.out.println(map.get(key).getName());//imprimo el valor que contiene cada llave
      }
      
      List<Product> products = new ArrayList<>();
      
      products.add(new Product("shirt",1000));
      products.add(new Product("jeans",100));
      products.add(new Product("shoes",300));
      
      System.out.println("=== LISTA ===");
      
      for(Product p:products){
         System.out.println(p.getName());
      }
   }

}

class Product{

   private String name;
   private double price;
   
   public Product(String name, double price){
   
      this.name = name;
      this.price = price;
   
   }
   
   //GETTERS Y SETTERS
   
   public String getName(){
      return name;
   }
   
   public double getPrice(){
      return price;
   }
}