package SinglyLinkedList;

public class FindLength {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int findLength() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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

    public static void main(String[] args) {
        FindLength sll = new FindLength();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(9);
        ListNode fifth = new ListNode(5);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();
        System.out.println("Length of list is " + sll.findLength());
    }

}
