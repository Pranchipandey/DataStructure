package CircularLinkedList;

public class CircularLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
        private ListNode next;
        private int data;

        private ListNode(int data) {
            this.data = data;

        }
    }

    public int size() {
        return size;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            ListNode temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
        size++;

    }

    public void display() {
        ListNode current = head;
        if (head == null) {
            System.out.println("list is empty");
        } else {

            System.out.println("Adding nodes to the start of the list: ");
            while (current.next != head) {
                System.out.print(current.data + "-->");
                current = current.next;
            }
            System.out.print(current.data + "-->");
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFirst(2);
        cll.display();

        cll.insertFirst(2);
        cll.insertFirst(2);
        cll.insertFirst(2);
        cll.insertFirst(2);
        cll.insertFirst(3);

        cll.display();
        System.out.println(cll.size());

    }
}
