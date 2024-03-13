import java.util.*;

public class maxsubarr{
    public static void main(String args[]){
        int arr[] = { 15 ,-2,2,-8,1,7,10,23};    //find amx subarray having sum 0

        HashMap<Integer , Integer> map = new HashMap<>();

        int sum =0;
        int len =0;

        for(int j=0;j<arr.length;j++){
            sum += arr[j];

            if(map.containsKey(sum)){
                len = Math.max(len , j - map.get(sum));          //if sum already exits in hashmap  len = j-i
            }
            else{
                map.put(sum , j);               //j is index of arr
            }
        }

        System.out.println("maxsubarray sum is : "+len);
    }
}