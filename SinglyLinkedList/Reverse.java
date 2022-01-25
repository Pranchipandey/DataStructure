package SinglyLinkedList;

public class Reverse {
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

    private ListNode getNodeAt(int idx) {
        ListNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public void reverse() {

        int li = 0;
        int ri = size - 1;
        while (li < ri) {
            ListNode left = getNodeAt(li);
            ListNode right = getNodeAt(ri);
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            li++;
            ri--;
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
        Reverse sll = new Reverse();
        sll.addFirst(6);
        sll.addFirst(2);
        sll.addFirst(3);
        sll.addFirst(9);
        sll.display();

        System.out.println(sll.size());
        sll.reverse();

        sll.display();
    }
}
