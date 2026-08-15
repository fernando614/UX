import java.util.*;
public class Main{
   public static void main(String args[]){
   
      //Primera forma de crear una lista
      List<String> names = new ArrayList<String>();
   
      names.add("carlos");
      names.add("bob");
      names.add("andy");
      names.add("bob");
   
      //Imprime el objeto lista
      System.out.println(names);
   
   
      //for mejorado
      System.out.println("=== FOR MEJORADO ===");
      for(String name:names){
         if(name.equals("bob")){
            System.out.println(name);
         }
      }
      
      System.out.println("=== FOR TRADICIONAL ===");
      for(int i = 0; i < names.size(); i++){
         if(names.get(i).equals("bob")){
            System.out.println(names.get(i));
         }
      }
      
      System.out.println("=== FOR STREAM PARADIGA FUNCIONAL ===");
      
      names.stream().filter(s -> s.equals("bob")).forEach(System.out::println);
   
   }

}