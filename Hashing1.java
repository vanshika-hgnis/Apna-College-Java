import java.util.*;
public class Hashing1 {
    
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        // Insertion4
        map.put("India",120);
        map.put("US",30);
        map.put("China",130);

        System.out.println(map);
        map.put("China",67);
        System.out.println(map);
        if(map.containsKey("China")){
            System.out.println("Present in the map");
        }
        else{
            System.out.println("Not Present");
        }
        // get - search
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey()+ " " +e.getValue()+ " ");

        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " "+ map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
