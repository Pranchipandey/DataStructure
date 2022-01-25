package CircularLinkedList;

public class Count {
    private ListNode head;
    private ListNode tail;
    private int count;

    private class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
        }
    }

    public void display() {
        ListNode current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current.next != head) {
                System.out.print(current.data + "-->");
                current = current.next;
            }
            System.out.print(current.data + "-->");
            System.out.println("null");
        }
    }

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void countNodes() {
        ListNode temp = head;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        count++;
        System.out.println("the no of nodes are: " + count);
    }

    public static void main(String[] args) {
        Count cll = new Count();

        cll.addLast(2);
        cll.addLast(4);
        cll.addLast(7);
        cll.addLast(9);
        cll.addLast(0);
        cll.addLast(6);
        cll.display();
        cll.countNodes();

    }

}
