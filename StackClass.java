public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        public static Node top;
        public static boolean IsEmpty(){
            return top == null;
        }
        public static void push(int data){
            Node nw = new Node(data);
            if(IsEmpty()){
                top =nw;
                return;
            }
            nw.next = top;
            top = nw;
        }
        public static int pop(){
            if(IsEmpty()){
                return -1;
            }
            int topdata = top.data;
            top = top.next;
            return topdata;
        }
        public static int peek(){
                    if(IsEmpty()){
                return -1;
            }
            return top.data;
        }
    }
    public static void main(String args[]){

    }
}
