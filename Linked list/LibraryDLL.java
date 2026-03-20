class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;

    Book(String t, String a, String g, int i, boolean av) {
        title = t;
        author = a;
        genre = g;
        id = i;
        available = av;
    }
}

public class LibraryDLL {
    Book head, tail;

    void add(String t, String a, String g, int i, boolean av) {
        Book b = new Book(t, a, g, i, av);
        if (head == null) {
            head = tail = b;
            return;
        }
        tail.next = b;
        b.prev = tail;
        tail = b;
    }

    void remove(int id) {
        Book temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    int count() {
        int c = 0;
        Book temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}