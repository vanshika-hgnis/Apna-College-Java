import java.util.*;
public class Patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Solid Rectangle");
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Hollow Rectangle");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i ==1 || j ==1|| i ==n || j ==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Half Rectangle");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Inverted Half Pyramid");
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Inverted HP by 180.");
        for(int i =1;i<=n;i++){
            for(int k =1;k<=n-i;k++ ){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Half Pyramid with Numbers");
        for(int i =1;i<=n;i++){
            int sum =1;
            for(int j =1;j<=i;j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println("");
        }
        System.out.println("Inverted Half Pyramid with Numbers");
        for(int i =n;i>=1;i-- ){
            int sum = 1;
            for(int j =1;j<=i;j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println("");
        }
        System.out.println("Flyod Triangle");
        int count =1;
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
        System.out.println("0-1 Triangle");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println("");
            sc.close();
        }
    }
}
