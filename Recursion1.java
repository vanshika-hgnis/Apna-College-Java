public class Recursion1 {

    public static void Print15(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);
        Print15(n + 1);
    }

    static void Print5to1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        Print5to1(n - 1);
    }

    public static void Firstn(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Firstn(i + 1, n, sum);
    }

    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1)
                + fib(n - 2);
    }

    public static int power(int n ,int m){
        if(m==0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return n*power(n,m-1);
    }
    public static void main(String args[]) {
        // Print5to1(10);
        // Print15(2);
        // Firstn(1, 60, 0);
        // int facres = Factorial(8);
        // System.out.println(facres);
        int N = 10;
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println("");
        int pres = power(5,3 );
        System.out.println(pres);
    }
}