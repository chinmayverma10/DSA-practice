import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> population = new HashMap<>();
        population.put("India", 150);
        population.put("USA", 40);
        population.put("USA", 35);
        System.out.println(population);

        System.out.println(population.get("India"));
        System.out.println(population.get("I"));

        System.out.println(population.containsKey("Indi"));
        population.remove("USA");
        System.out.println(population);
        System.out.println(population.size());
        System.out.println(population.isEmpty());

        population.put("Israel",80);

        Set<String> keys = population.keySet();
        System.out.println(keys);
        
        for (String key : keys) {
            System.out.println("Key = "+key +" Value = "+population.get(key));
            
        }
    }
}