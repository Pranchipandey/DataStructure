package SinglyLinkedList;

public class GetValue {

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

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.data;
        }

    }

    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("invalid arguments");
            return -1;
        } else {
            ListNode temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
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
        GetValue sll = new GetValue();
        sll.addFirst(6);
        sll.addFirst(2);
        sll.addFirst(3);
        sll.addFirst(9);

        sll.display();

        System.out.println(sll.size());

        System.out.println("Value at index 1 is " + sll.getFirst());
        System.out.println("value at last index i" + sll.getLast());
        System.out.println("value at given index is " + sll.getAt(1));

        sll.display();
    }
}
