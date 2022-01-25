package SinglyLinkedList;

public class MergeTwoSortedList {
    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            return;
        }
        ListNode temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static MergeTwoSortedList mergeTwoSortedList(MergeTwoSortedList l1, MergeTwoSortedList l2) {
        ListNode one = l1.head;
        ListNode two = l2.head;
        MergeTwoSortedList res = new MergeTwoSortedList();
        MergeTwoSortedList ans = res;
        while (one != null && two != null) {
            if (one.data < two.data) {
                res.addLast(one.data);
                one = one.next;
            } else {
                res.addLast(two.data);
                two = two.next;
            }
            while (one != null) {
                res.addLast(one.data);
                one = one.next;
            }
            while (two != null) {
                res.addLast(two.data);
                two = two.next;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        MergeTwoSortedList l1 = new MergeTwoSortedList();
        MergeTwoSortedList l2 = new MergeTwoSortedList();

        l1.addFirst(15);
        l1.addFirst(12);
        l1.addFirst(10);
        l1.addFirst(8);
        l1.addFirst(6);
        l1.addFirst(4);
        l1.addFirst(2);
        l2.addFirst(35);
        l2.addFirst(32);
        l2.addFirst(28);
        l2.addFirst(24);
        l2.addFirst(23);
        l2.addFirst(22);
        l2.addFirst(18);
        l1.display();
        l2.display();
        MergeTwoSortedList l3 = MergeTwoSortedList.mergeTwoSortedList(l1, l2);
        l3.display();

    }

}
