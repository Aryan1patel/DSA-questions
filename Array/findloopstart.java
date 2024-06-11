package question.linklist;

public class findloopstart {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        Node current = head;

        // Creating linked list from array
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        // Creating a cycle for testing: connect the last node to the node at index 2
        Node cycleStart = head;
        for (int i = 0; i < 2; i++) {
            cycleStart = cycleStart.next;
        }
        current.next = cycleStart; // Creating the cycle

        Node startOfCycle = detectCycle(head);
        if (startOfCycle != null) {
            System.out.println("Cycle detected at node with data: " + startOfCycle.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
