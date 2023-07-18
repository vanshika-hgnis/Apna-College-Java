import java.util.Collections;
import java.util.Scanner;

public class LinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

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
    public void deleteFirst(){
        if(head== null){
            System.out.println("The List is Empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        head = head.next;
    }

    // delete at last
    public void deleteLast(){
        if(head==null){
            System.out.println("THe List is Empty");
            return;
        }
        // i only one node
        if(head.next==null){
            head = null;
            return;
        }
        Node secondl = head;
        Node last = head.next; //  if head.next = null then last = null  so null.next == ERROR
        while(last.next!=null){
            last = last.next;
            secondl = secondl.next;
        }
        secondl.next = null;
    }

    // print
    public void printList() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1.insert node front\n2.Insert node at last\n3.Display list\n");
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
                    sc.close();
                    System.exit(0);
                default:
                System.out.println("Invalid choice");
                    break;
            }
        } while (true);

    }
}
