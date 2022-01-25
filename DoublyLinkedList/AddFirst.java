package DoublyLinkedList;

public class AddFirst {
    private ListNode head;
    private int size;

    private static class ListNode {
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
        if (head == null) {
            System.out.println("List is empty");
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }

        ListNode last = null;
        while (last != null) {
            System.out.print(last.data + " ");
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

    public static void main(String[] args) {
        AddFirst dll = new AddFirst();
        dll.addFirst(1);
        dll.addFirst(4);
        dll.addFirst(6);
        dll.addFirst(2);
        dll.addFirst(11);
        dll.addFirst(41);
        dll.display();
    }

}
