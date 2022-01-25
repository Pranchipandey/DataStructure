package Stack;

public class StackImplementation {
    private ListNode top;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) // insert at the beginning
    {
        // create new node temp and allocate memory
        ListNode temp = new ListNode(data);

        temp.next = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    public int pop() {

        if (top == null) {
            System.out.print("\nStack Underflow");

        }
        int result = top.data;
        top = top.next;
        return result;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");

        } else {
            ListNode temp = top;
            while (temp != null) {

                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        // create Object of Implementing class
        StackImplementation obj = new StackImplementation();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
