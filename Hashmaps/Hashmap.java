// package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void HashMapMethods(){
        HashMap<String,Integer>mp=new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 17);
        mp.put("Harsh", 25);
        mp.put("Ram", 20);
        // Getting Values
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));//null
        // Changing Value
        mp.put("Akash", 20); //21->20
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Harsh"));
        mp.putIfAbsent("Yash", 45); // not enter, yash is present
        mp.putIfAbsent("Yashika", 18);// enter, yashika is not present
        System.out.println(mp.keySet());// get all the keys
        System.out.println(mp.values());// get all the values
        System.out.println(mp.entrySet());// get all the entry set
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
