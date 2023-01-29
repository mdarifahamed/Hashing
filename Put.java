import java.util.*;

public class Put{
    public static void main(String[] args) {
        // Create 
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        // not exits value return (null)
        System.out.println(hm.get("Indonesia"));
    }
}