package Queue;

public class ImplementationUsingLL {
    ListNode front = null;
    ListNode rear = null;

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;

        }
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;

    }

    public int dequeue() {
        if (front == null) {
            System.out.println("queue is empty");

        }
        int temp = front.data;
        front = front.next;

        return temp;
    }

    public void display() {
        if (front == null) {
            System.out.println("queue is empty");
        } else {
            ListNode temp = front;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ImplementationUsingLL q = new ImplementationUsingLL();
        q.enqueue(21);
        q.enqueue(31);
        q.enqueue(25);
        q.enqueue(34);
        q.enqueue(90);
        q.enqueue(20);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
