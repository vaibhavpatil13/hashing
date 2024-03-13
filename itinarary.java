import java.util.*;

public class itinarary{
    public static String startpoint(HashMap<String , String> tickets){
        HashMap<String , String> revmap = new HashMap<>();

        for(String k:tickets.keySet()){
            revmap.put(tickets.get(k) , k);

        }

        for( String k:tickets.keySet()){
            if(!revmap.containsKey(k)){
                return k;
            }
        }

        return null;
    }
    public static void main(String args[]){
        HashMap<String , String> tickets = new HashMap<>();

        tickets.put("chennai" , "Bengaluru");
        tickets.put("mumbai" , "delhi");
        tickets.put("goa" , "chennai");
        tickets.put("delhi" , "goa");

        String start = startpoint(tickets);
        System.out.println(start);

        for(String k:tickets.keySet()){
            System.out.println(tickets.get(start));
            start = tickets.get(start);
        }


    }
}