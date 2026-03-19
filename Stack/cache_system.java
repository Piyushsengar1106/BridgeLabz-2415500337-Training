import java.util.Stack;
public class cache_system {
    public static void main(String[] args) {
        Stack<String> cache = new Stack<>();
        cache.push("Page1");
        cache.push("Page2");
        cache.push("Page3");

        System.out.println("Current Cache: " + cache);

        String accessedPage = "Page2";
        if (cache.contains(accessedPage)) {
            cache.remove(accessedPage);
            cache.push(accessedPage);
            System.out.println("Accessed " + accessedPage + ", updated Cache: " + cache);
        } else {
            System.out.println(accessedPage + " not in cache.");
        }

        String newPage = "Page4";
        if (cache.size() >= 3) {
            cache.remove(0); 
        }
        cache.push(newPage);
        System.out.println("Added " + newPage + ", updated Cache: " + cache);
    }
}