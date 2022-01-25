package CircularLinkedList;

public class DeleteFirst {
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
            System.out.println("list is empty");
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
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            }
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public static void main(String[] args) {
        DeleteFirst cll = new DeleteFirst();
        cll.addLast(3);
        cll.addLast(2);
        cll.addLast(4);
        cll.addLast(5);
        cll.addLast(2);
        cll.addLast(2);
        cll.display();
        System.out.println(cll.size());
        cll.deleteFirst();
        cll.deleteFirst();
        cll.display();
        System.out.println(cll.size());
    }

}
