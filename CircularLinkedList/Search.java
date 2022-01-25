package CircularLinkedList;

public class Search {
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

    public void search(int element) {
        ListNode temp = head;
        int i = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            while (temp.next != head) {
                if (temp.data == element) {
                    flag = true;
                    break;
                }
                temp = temp.next;
                i++;

            }
            if (temp.data == element) {
                flag = true;
            }
            if (flag == true) {
                System.out.println("searched Node is at position: " + i);
            } else {
                System.out.println("searched Node is not present");
            }

        }
    }

    public static void main(String[] args) {
        Search cll = new Search();
        cll.addLast(3);
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(5);
        cll.addLast(8);
        cll.addLast(7);
        cll.display();
        cll.search(5);
        cll.search(10);

    }

}
