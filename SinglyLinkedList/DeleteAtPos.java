package SinglyLinkedList.DataStructure;

public class DeleteAtPos {
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

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        return temp;

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

    public void deleteAt(int pos) {
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
            temp.next = temp.next.next;
            size--;
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
        DeleteAtPos sll = new DeleteAtPos();
        sll.addFirst(1);
        sll.addFirst(2);
        sll.addFirst(3);
        sll.addFirst(4);

        sll.display();
        System.out.println("List After Deletion");
        System.out.println(sll.size());
        sll.deleteAt(1);
        sll.display();
    }

}
