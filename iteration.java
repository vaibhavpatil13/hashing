import java.util.*;

public class iteration{
    public static void main(String args[]){
        HashSet<String> city = new HashSet<>();

        city.add("Mumbai");
        city.add("Delhi");
        city.add(("Nagpur"));
 
        // using iterator interface
        // Iterator it = city.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //using advance for loop

        for(String s: city){
            System.out.println(s);
        }
    }
}