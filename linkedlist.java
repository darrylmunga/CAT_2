// LinkedList.java
// Implementation of a Singly Linked List in Java
// MUNGA BANZA DARRYL-NICAISE 192538
// Date: March 2025
 
public class LinkedList {

    // Node class represents each element in the list
    class Node {
        int data;       
        Node next;      

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);     // create new node
        newNode.next = head;               // point new node to the old head
        head = newNode;                    // update head
        System.out.println(data + " inserted at the beginning.");
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // if list is empty, new node becomes head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;   // traverse to the last node
            }
            current.next = newNode;       // add new node at the end
        }
        System.out.println(data + " inserted at the end.");
    }

    // node: deleting from the beginning of the list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;  // move head to the next node
        }
    }

    // the list :Display all elements 
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method
   public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtBeginning(10);
    list.insertAtBeginning(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);

    list.display();

    list.deleteFromBeginning();
    list.display();
}

}
