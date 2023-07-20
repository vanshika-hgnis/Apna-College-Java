import java.util.LinkedList;
import java.util.Scanner;
public class LL1 { 

    public static void main(String args[]) {
        LinkedList<String> a = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<=n;i++){
            System.out.println("Enter word: ");
            String word = sc.nextLine();
            a.addFirst(word);
        }
System.out.println("The Said List: ");
            for(int i =0;i<n;i++){
                System.out.print(a.get(i)+"->");
        }
        System.out.print("null");
        System.out.println();
        System.out.print(a);

        sc.close();
    }
}
