package SinglyLinkedList;

public class Display {

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
        if (head == null) {
            System.out.println("List is empty");
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Display sll = new Display();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(2);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();

    }
}
