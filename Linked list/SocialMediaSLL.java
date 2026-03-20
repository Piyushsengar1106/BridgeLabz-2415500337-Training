import java.util.*;

class User {
    int id;
    String name;
    List<Integer> friends = new ArrayList<>();
    User next;

    User(int i, String n) {
        id = i;
        name = n;
    }
}

public class SocialMediaSLL {
    User head;

    User find(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addUser(int id, String name) {
        User u = new User(id, name);
        u.next = head;
        head = u;
    }

    void addFriend(int a, int b) {
        User u1 = find(a);
        User u2 = find(b);
        if (u1 != null && u2 != null) {
            u1.friends.add(b);
            u2.friends.add(a);
        }
    }
}