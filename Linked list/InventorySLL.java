class Item {
    String name;
    int id, qty;
    double price;
    Item next;

    Item(String n, int i, int q, double p) {
        name = n;
        id = i;
        qty = q;
        price = p;
    }
}

public class InventorySLL {
    Item head;

    void add(String n, int i, int q, double p) {
        Item item = new Item(n, i, q, p);
        item.next = head;
        head = item;
    }

    void remove(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    double totalValue() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}