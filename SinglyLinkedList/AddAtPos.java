package SinglyLinkedList;

public class AddAtPos {
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

    public void addFirst(int val) {

        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
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
        size++;
    }

    public void addAt(int pos, int value) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid Argument");
        } else if (pos == 0) {
            addFirst(value);
        } else if (pos == size) {
            insertLast(value);
        } else {
            ListNode newNode = new ListNode(value);
            ListNode temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        AddAtPos sll = new AddAtPos();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addFirst(3);
        sll.addFirst(4);

        sll.display();
        System.out.println(sll.size());
        System.out.println("List after addition");
        sll.addAt(1, 10);

        sll.display();

    }
}
