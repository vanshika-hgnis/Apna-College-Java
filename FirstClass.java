import java.util.Scanner;

class FirstClass {
    public static void main(String args[]){
        // System.out.println("Hello World");
        // System.out.println("NULL");
        // String name = "Rectangle";
        // System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int  age = sc.nextInt();
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Age: ");
        System.out.println(age);
        sc.close();
    }
    // System.out.print
    // System.out.println  System is a class " " or '';  , print is a function
}

