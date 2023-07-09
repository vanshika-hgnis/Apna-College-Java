import java.util.*;
public class Array {
    public static void main(String args[]){
        int[] marks = new int[10];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 98;
        for(int i =0;i<3;i++){
            System.out.println(marks[i]);
        }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i =0;i<size;i++){
            number[i] = sc.nextInt();
        }
        // for(int i =0;i<size;i++){
            // System.out.print(number[i]+ " ");
        // }

        System.out.println("Enter the number  to be searched");
        int k = sc.nextInt();
        System.out.println("This is known as linear search");
        for(int i =0;i<size;i++){
            if(k == number[i]){
                System.out.println("The Index: "+  i);
            }
        }
sc.close();
    }
}
