package SinglyLinkedList;

public class AddLast {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        ListNode current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {

            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        AddLast sll = new AddLast();
        sll.insertLast(1);
        sll.insertLast(2);
        sll.insertLast(3);
        sll.insertLast(4);
        sll.insertLast(5);
        sll.display();

    }

}