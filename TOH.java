import java.util.*;
public class TOH {
public static int first = -1;
public static int last = -1;
    public static void Hanoi(int Disks,String source,String aux,String target){
        if(Disks == 1){
            System.out.println("Move "+Disks+ "disk from source to target");
        }
        else{
            Hanoi(Disks-1,source,target,aux);
            System.out.println("Move "+ Disks+" disk from "+ source+"to"+ target );
            Hanoi(Disks-1,aux,source,target);
        }
    }

    public static void Reverse(String word,int i){
        if(i == 0){
            System.out.println(word.charAt(i));
        }
        System.out.println(word.charAt(i));
        Reverse(word,i-1);
    }
    public static void FirstLastOccu(String word,int ind,char el){
        if(ind == word.length()){
            System.out.println(first);
            System.out.println(last);
        }
        char curr = word.charAt(ind);
        if(curr == el){
            if(first == -1){
                first = ind;
            }
            else{
                last  = ind;
            }
        }
        FirstLastOccu(word,ind+1,el);
    }
    public static boolean StrictlyIncreasing(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;  // Base case: reached the last element
        }
    
        if (arr[index] < arr[index + 1]) {
            return StrictlyIncreasing(arr, index + 1);  // Recursive call
        } else {
            return false;
        }
    }
    
    public static void main(String args[]){
        // System.out.println("Displaying the TOH problem");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the disks: ");
        // int disks = sc.nextInt();    Hanoi(disks,"Source","aux","target");
        // Reverse("Vanshika",7);
        // FirstLastOccu("abbbabbbahj",0,'a');
        int arr[] = {1,2,3,4,55,455};
        System.out.println(StrictlyIncreasing(arr,0));
        sc.close();
    }
}
