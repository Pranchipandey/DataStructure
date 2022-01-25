package CircularLinkedList;

public class Sort {
    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;

        }
    }

    public int size() {
        return size;

    }

    public void display() {
        ListNode temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp.next != head) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print(temp.data + "-->");
            System.out.println("null");
        }
    }

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }
    }

    public void sortList() {
        ListNode current = null;
        ListNode index = null;
        int temp;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            for (current = head; current.next != head; current = current.next) {
                for (index = current.next; index != head; index = index.next) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Sort cll = new Sort();
        cll.addLast(4);
        cll.addLast(6);
        cll.addLast(1);
        cll.addLast(10);
        cll.addLast(7);
        cll.addLast(9);
        cll.addLast(3);
        cll.addLast(5);
        cll.display();
        cll.sortList();
        cll.display();

    }
}
