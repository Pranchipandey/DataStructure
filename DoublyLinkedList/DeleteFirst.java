package DoublyLinkedList;

public class DeleteFirst {
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
        size++;
    }

    public void deleteFirst() {

        head = head.next;
        size--;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;

    }

    public void deleteAtPos(int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid Arguments");
        } else if (pos == 0) {
            deleteFirst();
        } else if (pos == size) {
            deleteLast();

        } else {
            ListNode temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next.previous = temp.previous;
            temp.previous.next = temp.next;
            size--;
        }
    }

    public static void main(String[] args) {
        DeleteFirst dll = new DeleteFirst();
        dll.addFirst(1);
        dll.addFirst(4);
        dll.addFirst(6);
        dll.addFirst(2);
        dll.addFirst(11);
        dll.addFirst(41);
        dll.display();
        dll.deleteFirst();
        dll.display();
        dll.deleteLast();
        dll.display();
        System.out.println(dll.size());
        dll.deleteAtPos(2);
        dll.display();
    }
}
