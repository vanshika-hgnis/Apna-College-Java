import java.util.*;
public class Strings {
    public static void main(String args[]){
        // String name = "Vanshika";
        Scanner sc = new Scanner(System.in);
        // String last = sc.nextLine();
        // String full = name+last;
        // System.out.println(full);
        // System.out.println("The length of the string "+  last.length()+ name.length());
        
        // for(int i =0;i<full.length();i++){
        //     System.out.println(full.charAt(i));
        // }

        // String name = "Vansh";
        // String name1 = "Vanshika";

        // if(name.compareTo(name1) == 0){
        //     System.out.println("The names are same");
        // }
        // else{
        //     System.out.println("The words are differenent");
        // }

        // if (new String("Tony").equals(new String("Tony"))) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        String sentence = "My name is Tony";
        String name = sentence.substring(1,sentence.length());
        System.out.println(name);
        sc.close();
    }
}
