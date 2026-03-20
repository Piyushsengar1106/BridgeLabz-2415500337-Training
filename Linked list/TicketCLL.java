class Ticket {
    int id;
    String name, movie, seat, time;
    Ticket next;

    Ticket(int i, String n, String m, String s, String t) {
        id = i;
        name = n;
        movie = m;
        seat = s;
        time = t;
    }
}

public class TicketCLL {
    Ticket head;

    void add(int i, String n, String m, String s, String t) {
        Ticket tk = new Ticket(i, n, m, s, t);
        if (head == null) {
            head = tk;
            tk.next = head;
            return;
        }
        Ticket temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = tk;
        tk.next = head;
    }

    void remove(int id) {
        if (head == null) return;
        Ticket temp = head, prev = null;
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

    int count() {
        if (head == null) return 0;
        int c = 0;
        Ticket temp = head;
        do {
            c++;
            temp = temp.next;
        } while (temp != head);
        return c;
    }
}