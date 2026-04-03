public class circularqueue {
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  Node front;
  Node rear;

  void enqueue(int data) {
    Node newNode = new Node(data);
    if (front == null) {
      front = newNode;
      rear = newNode;
      rear.next = front;
      return;
    } 
    rear.next = newNode;
    rear = newNode;
    rear.next = front;
    
  }
  void dequeue(){
    if (front == null) {
      System.out.println("queue is empty");
      return;
    }
    if (front == rear) {
      front = null;
      rear = null;
      return;
    }
    front = front.next;
    rear.next = front;
  }
  void display(){
    if (front == null) {
      System.out.println("queue is empty");
      return;
    }
  
    Node temp=front;
    while(temp.next!=front){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.print(temp.data);
  }

  public static void main(String[] args) {
    circularqueue cq = new circularqueue();
    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);

    cq.dequeue();
    cq.dequeue();
    // cq.dequeue();

    cq.display();
  }
}
