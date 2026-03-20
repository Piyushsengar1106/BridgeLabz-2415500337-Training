class Process {
    int id, burst;
    Process next;

    Process(int i, int b) {
        id = i;
        burst = b;
    }
}

public class RoundRobinCLL {
    Process head;

    void add(int i, int b) {
        Process p = new Process(i, b);
        if (head == null) {
            head = p;
            p.next = head;
            return;
        }
        Process temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = p;
        p.next = head;
    }

    void execute(int quantum) {
        if (head == null) return;
        Process temp = head;
        do {
            if (temp.burst > quantum) {
                temp.burst -= quantum;
            } else {
                temp.burst = 0;
            }
            temp = temp.next;
        } while (temp != head);
    }
}