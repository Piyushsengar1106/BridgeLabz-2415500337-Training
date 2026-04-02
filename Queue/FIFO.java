public class FIFO {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] pages = {"Page1", "Page2", "Page3", "Page4"};
        String[] cache = new String[cacheSize];
        int index = 0;

        for (String page : pages) {
            if (!contains(cache, page)) {
                cache[index] = page;
                index = (index + 1) % cacheSize; // Move to the next index in a circular manner
            }
            System.out.println("Current Cache: " + java.util.Arrays.toString(cache));
        }
    }

    private static boolean contains(String[] cache, String page) {
        for (String p : cache) {
            if (p != null && p.equals(page)) {
                return true;
            }
        }
        return false;
    }

  
}
