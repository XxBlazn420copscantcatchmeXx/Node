public class Node {
  int data;
  Node next;

  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }
}

public class LinkedList.java{
class LinkedList {
  Node head;

  public LinkedList(Node head){
    this.head = head;
  }

   void add(Node node){
    Node current = head;
    while(current.next != null){
      current = current.next;
    }
    current.next = node;
    }
  }
}

Main.java
class Main{
 public static void main(String[]args){
  LinkedList linkedList = new LinkedList(new Node(5, new Node(7, new Node(2, new Node(15, null)))));
  linkedList.add(new Node(10, null));
  linkedList.head = new Node(50, linkedList.head);
  linkedList.head.next = new Node(50, linkedList.head.next);
  }
}
