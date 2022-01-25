package SinglyLinkedList;

public class AddFirst {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addFirst(int val) {

        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddFirst sll = new AddFirst();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addFirst(3);
        sll.addFirst(4);

        sll.display();

    }

}
