import java.util.*;
public class StackArray {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean IsEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(IsEmpty()){
                return -1;
            }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
        }
        public static int peek(){
            int top=  list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(11);
        s.push(143);
        s.push(114);
        s.push(13);

        while(!s.IsEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
