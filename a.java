import java.util.*;
public class a {

    static void GetBit(int n, int pos) {
        int bitMask = 1 << pos;
        // System.out.println(bitMask);
        if ((bitMask & n) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }

    static void SetBit(int n, int pos) {
        String org = Integer.toBinaryString(n);
        System.out.println("The original number " + org);
        int bitmask = 1 << pos;
        int number = bitmask | n;
        String modified = Integer.toBinaryString(number);
        System.out.print("The modified number: ");
        System.out.println(modified);
    }

    static void ClearBit(int n, int pos) {
        String org = Integer.toBinaryString(n);
        System.out.println("The original: " + org);
        int bitmask = 1 << pos;
        int not = ~bitmask;
        int number = n & not;
        String modified = Integer.toBinaryString(number);
        System.out.println("The modified number: ");
        System.out.println(modified);
    }

    static void UpdateBit(int n, int pos) {
        Scanner sc = new Scanner(System.in);
        int bitmask, number;
        System.out.println("Enter which to update 1or0:");
        int o = sc.nextInt();
        String org = Integer.toBinaryString(n);
        System.out.println("The original number " + org);
        if (o == 1) {
            bitmask = 1 << pos;
            number = n | bitmask;
        } else {
            bitmask = 1 << pos;
            int not = ~bitmask;
            number = not & n;
        }
        System.out.println("The modified number " + Integer.toBinaryString(number));
        sc.close();
    }

    public static void main(String args[]) {
        int n, pos;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("0.Exit\n1.Getbit\n2.SetBit\n3.ClearBit\n4.Update Bit\n ");
            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();
            System.out.println("Enter number:");
            n = sc.nextInt();
            System.out.println("Enter pos: ");
            pos = sc.nextInt();
            switch (choice) {
                case 1:
                    GetBit(n, pos);
                    break;
                case 2:
                    SetBit(n, pos);
                    break;
                case 3:
                    ClearBit(n, pos);
                    break;
                case 4:
                    UpdateBit(n, pos);
                    break;
                default:
                    sc.close();
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}

