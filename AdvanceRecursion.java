public class AdvanceRecursion {

    public static void AllPermutation(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            AllPermutation(newStr,perm+curr);
        }
    }
    public static void main(String args[]){
        AllPermutation("abc","");
    }
}
