public class Main{
   public static void main(String args[]){
     Product prod = new Product("Hamburguesa",160);
     
     System.out.println("Nombre del producto es: " + prod.getName());
   }
}

class Product{
   private String name;
   private double salePrice;
   
   public Product(String name, double salePrice){
      this.name = name;
      this.salePrice = salePrice;
   }
   
   public String getName(){
      return name;
   }
   
   public double getSalePrice(){
      return salePrice;
   }
}