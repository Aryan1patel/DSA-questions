package question.linklist;

public class middleelement {

    // Node class definition
    class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    // Head of the linked list
    static Node head;

    // Method to find the middle element of the linked list
    public static Node middle(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("The linked list is empty");
        }

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to insert a new node at the tail of the linked list
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        middleelement list = new middleelement();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.print("Original List: ");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null

        Node middle = middle(list.head);
        System.out.println("Middle element: " + middle.data);  // Output: Middle element: 30
    }
}
