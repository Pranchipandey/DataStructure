package DoublyLinkedList;

public class AddAfter {
    private ListNode head;
    private int size;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        private ListNode(int data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public void display() {

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        ListNode last = null;
        while (last != null) {
            System.out.println(last.data + "-->");
            last = last.previous;
        }
        System.out.println("null");
    }

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        newNode.previous = null;
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void addBefore(ListNode nextNode, int val) {
        if (nextNode == null) {
            System.out.println("The given node can't be null");
            return;
        }
        ListNode newNode = new ListNode(val);
        newNode.previous = nextNode.previous;
        nextNode.previous = newNode;
        newNode.next = nextNode;

        if (nextNode != null) {
            newNode.previous.next = newNode;
        }

    }

    public void addAfter(ListNode prevNode, int val) {
        if (prevNode == null) {
            System.out.println("The given previous node can't be null");
            return;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.previous = prevNode;
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        }
    }

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        ListNode last = head;
        newNode.next = null;

        if (head == null) {
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = newNode;

        newNode.previous = last;

    }

    public static void main(String[] args) {
        AddAfter dll = new AddAfter();
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(6);
        dll.addLast(2);
        dll.addLast(18);
        dll.addLast(41);
        dll.display();
        dll.addAfter(dll.head.next, 1);
        dll.display();
        dll.addBefore(dll.head.next.next, 24);
        dll.display();

    }

}
