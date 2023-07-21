
import java.util.Scanner;

public class LinkedList {
    private Node head;
    static int size;

    LinkedList(){
        size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add --- add first , add last;
    public void addFirst(String data) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            return;
        }
        nw.next = head;
        head = nw;
    }

    public void addLast(String data) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nw;
    }

    // delete at first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The List is Empty");
            return;
        }
                size--;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;

    }

    // delete at last
    public void deleteLast() {
        if (head == null) {
            System.out.println("THe List is Empty");
            return;
        }
        // i only one node
                size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondl = head;
        Node last = head.next; // if head.next = null then last = null so null.next == ERROR
        while (last.next != null) {
            last = last.next;
            secondl = secondl.next;
        }
        secondl.next = null;

    }

    // print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseIterable(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;

            // update
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public Node reverseRecursive(Node head){

        if(head == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(
                    "\nThe Size Of the List: " + size + "\n1.insert node front\n2.Insert node at last\n3.Display list\n4.delete first node\n5.delete last node\n6.Reverse\n");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data: ");
                    String data = sc.nextLine();
                    ll.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter the data: ");
                    data = sc.nextLine();
                    ll.addLast(data);
                    break;
                case 3:
                    ll.printList();
                    break;
                case 4:
                    ll.deleteFirst();
                    break;
                case 5:
                    ll.deleteLast();
                    break;
                    case 6:
                    ll.reverseIterable();
                    break;
                case 7:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);

    }
}
