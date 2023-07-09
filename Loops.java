import java.util.*;

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for(int i =0;i<=10;i++){
        //     System.out.println(num+"X"+i+"="+(num*i));
        // }

          // int num = sc.nextInt();
        // for(int i =0;i<=10;i++){
        //     System.out.println(num+"X"+i+"="+(num*i));
        // }
        int sum = 0;
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}