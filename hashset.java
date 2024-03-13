import java.util.*;

public class hashset{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(2);
        hs.add(5);
        hs.add(8);
        hs.add(2);

        System.out.println(hs);

        System.out.println(hs.contains(5));

        hs.remove(5);
        System.out.println(hs);
    }
}