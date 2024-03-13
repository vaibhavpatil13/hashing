import java.util.*;

public class anagram{
    public static boolean isAnagram(String s , String t){
        HashMap<Character , Integer> map = new HashMap<>();

        if(s.length()!= t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0)+1);

        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);

            if(map.get(ch)!= null){     //if hashmap not contains char
                if(map.get(ch)==1){      //contains char 
                    map.remove(ch);
                }
                else{
                    map.put(ch , map.get(ch)-1);    //contains more than one same char
                }
            }
            else{
                return false;      //if not contains char
            }
        }

        return map.isEmpty();     //if empty true or false
    }
    public static void main(String args[]){
        String s ="race";
        String t ="care";

        System.out.print(isAnagram(s,t));
    }
}