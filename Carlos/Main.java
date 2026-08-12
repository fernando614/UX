public class Main{
   public static void main(String []args){

   Product product1 = new Product("Leche",10);
   Product product2 = new Product("Galleta",10);
   Product product3 = new Product("Carne",10);
   Product product4 = new Product("Cereal",10);
   Product product5 = new Product("Queso",10);

   Sale sale = new Sale();

   sale.addProduct(product1);
   sale.addProduct(product2);
   sale.addProduct(product3);
   sale.addProduct(product4);
   sale.addProduct(product5);

   
   System.out.println("El total de la venta es: " + sale.getTotal());
}

}

class Product{


   String name;
   double price;

   public Product(String name, double price) {
      this.name = name;
      this.price = price;
}
}

class Sale{

   Product[] products = new Product[5];
   int quantity = 0;

 
   void addProduct(Product product) {
      products[quantity] = product;
      quantity++;


}

   double getTotal() {
   double total = 0;
   for(int i = 0; i < quantity; i++) {
     total += products[i].price;
}
return total;
}
         

}
