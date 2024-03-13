import java.util.*;

public class hasmap{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("India" , 100);
        hm.put("Us" , 20);
        hm.put("Uk" , 70);

        System.out.println(hm);

        // System.out.println(hm.get("Us"));
        // System.out.println(hm.containsKey("India"));
        // hm.remove("Us");
        // System.out.println(hm);

        // hm.clear();

        // System.out.println(hm.isEmpty());

        //iteration

        Set<String> keys = hm.keySet();

        System.out.println(keys);

        for (String k : keys){
            System.out.println("key: "+k+", value: "+hm.get(k));
        }
    }
}