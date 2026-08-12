public class Main{
   public static void main(String args[]){
   
      Product beer = new Product("Heineken",60);
      
      System.out.println("Nombre del product: " + beer.name);
      System.out.println("Precio del producto: " + beer.price);
      
   }
}

class Product{
   String name;
   double price;
   
   public Product(String name, double price){
      this.name = name;
      this.price = price;
   }
}