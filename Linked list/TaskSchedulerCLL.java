class Task {
    int id;
    String name, priority, date;
    Task next;

    Task(int i, String n, String p, String d) {
        id = i;
        name = n;
        priority = p;
        date = d;
    }
}

public class TaskSchedulerCLL {
    Task head;

    void add(int i, String n, String p, String d) {
        Task t = new Task(i, n, p, d);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    void delete(int id) {
        if (head == null) return;
        Task temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) prev.next = temp.next;
                else head = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void display() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}