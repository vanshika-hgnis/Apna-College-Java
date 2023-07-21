import java.util.HashSet;
import java.util.Iterator;
public class Hashing {

    public static void main(String args[]){
        // Creating 
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("The Size of the hashset is:" + set.size());
        if(set.contains(1)){
            System.out.println("Contains");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We just deleted 1 set.remove(1);");
        }

        System.out.println(set);
        set.add(4 1);
        set.add(34);
        Iterator it = set.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
