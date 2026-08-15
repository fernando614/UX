public class Main{
   public static void main(String [] args){
   
   
      //creo mi lista
      MyList list = new MyList();
      
      list.insert(5);
      list.insert(10);
      list.insert(15);
      list.insert(20);
      
      list.show();
   }
}

class Node{

   int data;
   Node next;

}

class MyList{

   Node head;
   
   public void insert(int data){
   
      Node node = new Node();
      node.data = data;
      
      //validar si la cabeza es nula
      if(head == null){
         head = node;
         return;
      }
      
      Node n = head;
      
      while(n.next != null){
         n = n.next;
      }
      
      n.next = node;    
      
      
   }
   
   public void show(){
      Node n = head;
      
      while(n.next != null){
         System.out.print(n.data + " -> ");
         n = n.next;
      }
      
      System.out.print(n.data);
   }

}