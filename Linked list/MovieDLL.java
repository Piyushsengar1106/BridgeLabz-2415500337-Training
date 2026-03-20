class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

public class MovieDLL {
    Movie head, tail;

    void addEnd(String t, String d, int y, double r) {
        Movie m = new Movie(t, d, y, r);
        if (head == null) {
            head = tail = m;
            return;
        }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }

    void remove(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }
}