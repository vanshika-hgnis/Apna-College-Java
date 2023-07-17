import java.util.*;
public class Recursion2 {
public static int first = -1;
public static int last = -1;
public static boolean [] map = new boolean[26];
public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
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

    public static void Movex(String word,int index,int count , String newword){

        if(index == word.length()){
            System.out.println(newword);
            return;
        }

        char curr = word.charAt(index);
        if(curr ==  'x'){
            count++;
            Movex(word,index+1,count,newword);
        }
        else{
            newword += curr;
            Movex(word,index+1,count,newword);
        }

    }

    public static void removeDuplicate(String str,int index,String newStr){
        if(index == str.length()){
            System.out.print(newStr);
            return;
        }
        char curr = str.charAt(index);
        if(map[curr - 'a']){
            removeDuplicate(str, index+1, newStr);
        }
        else{
            newStr += curr;
            map[curr - 'a'] = true;
            removeDuplicate(str, index+1, newStr);
        }

    }
    
    public static void Subsequence(String org,int ind,String newStr){
        if(ind == org.length()){
            System.out.println(newStr);
            return;
        }
        char currChar =  org.charAt(ind);

        // to be 
    Subsequence(org, ind+1, newStr+currChar);

        // nor not
        Subsequence(org, ind+1, newStr);

    }
    // 0  - .
    // 1-abc
    // 2-def 
    // 3-jkl
    public static void KeypadComb(String str,int ind,String Combination){
        if(ind == str.length()){
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(ind);
        String mapping = keypad[currChar - '0'];

        for(int i =0;i<mapping.length();i++){
            KeypadComb(str, ind+1, Combination+mapping.charAt(i));
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
    Movex("abcxdxxexfgx",0,0,"");
removeDuplicate("abbbabbcded",0,""); 
System.out.println("");
Subsequence("abc",0,"");
KeypadComb("23",0,"");
        sc.close();
    }
}
