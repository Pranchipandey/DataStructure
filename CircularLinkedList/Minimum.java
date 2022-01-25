package CircularLinkedList;

public class Minimum {
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
            while (temp.next != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print(temp.data + "-->");
            System.out.println("null");
        }
    }

    public void add(int val) {
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

    public void minNode() {
        ListNode current = head.next;
        int min = head.data;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            while (current.next != head) {
                if (min > current.data) {
                    min = current.data;
                }
                current = current.next;

            }
            if (min > current.data) {
                min = current.data;
            }
            System.out.println("minimum element is " + min);
        }

    }

    public void maxNode() {
        ListNode temp = head;
        int max = head.data;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            while (temp.next != head) {
                if (max < temp.data) {
                    max = temp.data;
                }
                temp = temp.next;
            }

            if (max < temp.data) {
                max = temp.data;
            }
            System.out.println("max element is " + max);
        }
    }

    public static void main(String[] args) {
        Minimum cll = new Minimum();
        cll.add(8);
        cll.add(7);
        cll.add(6);
        cll.add(5);
        cll.add(4);
        cll.add(3);
        cll.add(2);
        cll.add(10);

        cll.minNode();
        cll.maxNode();

    }

}
