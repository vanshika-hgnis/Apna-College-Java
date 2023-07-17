import java.util.*;
import java.util.ArrayList;

public class learnarraylist {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.print(a);
        int el = a.get(1);
        System.out.println("");
        System.out.println(el);
        a.add(1,4);
        System.out.print(a);
        a.set(1,5);
        System.out.println("");
        System.out.print(a);
        a.remove(3);
        System.out.print("\n"+a+"\n");
        System.out.println("The size of the arraylist: "+a.size());
        // loops 
        for(int i =0;i<a.size();i++){
            System.out.print(a.get(i)+ " ");
        }
        System.out.println();
        System.out.println("The Sorting of the arraylist");
        Collections.sort(a);
        System.out.print(a);

    }
}
