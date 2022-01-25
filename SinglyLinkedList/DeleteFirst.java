package SinglyLinkedList.DataStructure;

public class DeleteFirst {
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

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        return temp;
    }

    public static void main(String[] args) {
        DeleteFirst sll = new DeleteFirst();
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
        sll.deleteFirst();
        sll.display();

    }

}
