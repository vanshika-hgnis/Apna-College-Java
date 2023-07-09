import java.util.*;
public class function {

    public static void GetName(String name){
        System.out.println("The Name is "+ name);
        return;
    }
    public static int Add(int a ,int b){
        int c = a+ b;
        return c;
    }
    public static void  Factorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
        }
        int fac = 1;
        for(int i =n;i>=1;i--){
            fac = fac* i;
        }
        System.out.print(fac);
    }
    public static void GCD(int a ,int b){
        for(int i =1;i<a && i<=b;i--){
            if(a%i==0 && b %i == 0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // GetName(name);
       int a = sc.nextInt();
    int b = sc.nextInt();
    // int c = Add(a,b);
    // System.out.println(c);
    // int n = sc.nextInt();
    // Factorial(n);
    GCD(a,b);
    sc.close();
    }
}
