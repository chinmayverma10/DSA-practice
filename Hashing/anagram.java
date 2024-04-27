import java.util.Set;
import java.util.HashMap;

public class anagram {
    public static boolean checkAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> tm1 = new HashMap<>();
        // TreeMap<Character,Integer> tm2 = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            tm1.put(s.charAt(i),tm1.getOrDefault(s.charAt(i), 0)+1);
            // tm2.put(t.charAt(i),tm2.getOrDefault(t.charAt(i), 0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(tm1.get(t.charAt(i)) != null){
                if(tm1.get(t.charAt(i)) == 1){
                    tm1.remove(t.charAt(i));
                } else{
                    tm1.put(s.charAt(i),tm1.get(s.charAt(i))-1);
                }
            }else{
                return false;    
            }
        }

        return tm1.isEmpty();
    }
    public static void main(String[] args) {
        String s = "care";
        String t = "raca";
        System.out.println(checkAnagram(s, t));
    }
}
