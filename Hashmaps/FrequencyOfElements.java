// package Hashmaps;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,5,8,7,1,2,8,8};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:arr){
            if(!mp.containsKey(i)){
                mp.put(i, 1);
            }
            else{
                mp.put(i, mp.get(i)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(mp.entrySet());
        int maxFreq=0;
        int ansKey=-1;
        // for(var e:mp.entrySet()){
        //     if(e.getValue()>maxFreq){
        //         maxFreq=e.getValue();
        //         ansKey=e.getKey();
        //     }
        // }
        for(var e:mp.keySet()){
            if(mp.get(e)>maxFreq){
                maxFreq=mp.get(e);
                ansKey=e;
            }
        }
        System.out.printf("%d has frequency has %d",ansKey,maxFreq);
    }
}
