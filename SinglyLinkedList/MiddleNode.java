package SinglyLinkedList;

public class MiddleNode {
    private ListNode head;
    private int size;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public int size() {
        return size;
    }

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
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

    public int mid() {
        ListNode s = head;
        ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s.data;
    }

    public static void main(String[] args) {
        MiddleNode sll = new MiddleNode();
        sll.addFirst(6);
        sll.addFirst(2);
        sll.addFirst(6);
        sll.addFirst(9);
        sll.addFirst(4);
        sll.display();

        System.out.println(sll.size());
        System.out.println(sll.mid());

    }

}
