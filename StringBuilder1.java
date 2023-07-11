import java.util.*;
public class StringBuilder1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));
        // setCharAt 
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        StringBuilder h = new StringBuilder("h");
        h.append('e');
        h.append('l');
        h.append('l');
        h.append('o');
        System.out.println(h);

        System.out.println("Reversing a string");
        StringBuilder word = new StringBuilder("Hello");
        for(int i = 0;i<word.length()/2;i++){
            int front = i;
            int last = word.length() - 1 -i;  
            char frontChar = word.charAt(front);
            char lastChar = word.charAt(last);

            word.setCharAt(front, lastChar);
            word.setCharAt(last, frontChar);
        } 
        System.out.println(word);
    }
}
