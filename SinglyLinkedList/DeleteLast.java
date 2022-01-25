package SinglyLinkedList;

public class DeleteLast {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
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
        DeleteLast sll = new DeleteLast();
        sll.head = new ListNode(5);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(10);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.display();
        System.out.println("List After Deletion");
        sll.deleteLast();
        sll.display();
    }
}
