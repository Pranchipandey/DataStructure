package SinglyLinkedList;

public class RemoveDuplicates {
    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
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

    public void addLast(int val) {
        ListNode temp = new ListNode(val);
        temp.data = val;
        temp.next = null;

        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("list is empty");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {

            head = head.next;
            size--;
        }
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public void display() {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void removeDuplicates() {
        RemoveDuplicates res = new RemoveDuplicates();
        while (this.size > 0) {
            int val = this.getFirst();
            this.removeFirst();
            if (res.size == 0 || res.tail.data != val) {
                res.addLast(val);
            }
        }
        this.head = res.head;
        this.tail = res.tail;
        this.size = res.size;
    }

    public static void main(String[] args) {
        RemoveDuplicates l1 = new RemoveDuplicates();
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(5);

        l1.display();
        l1.removeDuplicates();
        l1.display();

    }
}
