public class insertatend {
  
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static class Dequeue {
        Node front;
        Node rear;
        int size;

        void insertAtFront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                newNode.prev = rear;
                rear = newNode;
            }
            size++;
        }

        void deleteFromFront() {
            if (front == null) {
                return;
            }

            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                front.prev = null;
            }
            size--;
        }

        void deleteFromEnd() {
            if (rear == null) {
                return;
            }

            if (front == rear) {
                front = rear = null;
            } else {
                rear = rear.prev;
                rear.next = null;
            }
            size--;
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Dequeue dq = new Dequeue();
        dq.insertAtEnd(1);
        dq.insertAtEnd(2);
        dq.insertAtFront(0);
        dq.insertAtFront(-1);
        dq.deleteFromFront();
        dq.deleteFromEnd();

        System.out.println("Dequeue after operations:");
        dq.display();
        System.out.println("Size: " + dq.size);
    }
}

  

