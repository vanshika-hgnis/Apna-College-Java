import java.util.*;
public class BitManipulation {

    static void  GetBit(int n,int pos ){
        int bitMask = 1<<pos;
        // System.out.println(bitMask);
        if((bitMask & n) == 0){
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("Bit was 1");
        }
    }
    public static void main(String args[]){
        do {
            System.out.print("1.Getbit\n2.SetBit\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Enter pos: ");
                int pos = sc.nextInt();
                GetBit(n,pos);
                break;
                default:
                break;
            }
        }while(true);

    }
}
