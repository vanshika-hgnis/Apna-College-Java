import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        // declaraing the array
        int [][] num = new int[r][c];
        // inputing the values
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                num[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("The ");
        sc.close();
    }
}
