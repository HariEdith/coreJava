package learn08;

import java.util.HashMap;
import java.util.Map;

public class MapExe {
    public static void main(String args[]){
        Map<Integer, String> hashMap=new HashMap<>();
        hashMap.put(1,"apple");
        hashMap.remove(1);
        hashMap.put(1,"apple");
        hashMap.put(2,"banana");
        hashMap.put(3,"orange");
        hashMap.put(4,"peach");

        System.out.println(hashMap);
    }
}
