import java.util.*;
public class AdvancePatterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Butterfly Pattern");
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Solid Rhombus");
        for(int i = 1;i<=n;i++){
            int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Number Pyramid");
        for(int i =1;i<=n;i++){
            int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Palindromic Pattern");
        for(int i =1;i<=n;i++){
            int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            for(int j =2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        } 
        System.out.println("Diamond pattern");
        for(int i =1;i<=n;i++){
            int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i =n;i>=1;i--){
                int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            System.out.println("");
            sc.close();
        }
    }
}
