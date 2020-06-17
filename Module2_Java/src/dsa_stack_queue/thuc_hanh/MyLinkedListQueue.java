package dsa_stack_queue.thuc_hanh;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        public String key;
        public Node next;

        public Node(String key) {
            this.key = key;
            this.next = null;
        }
    }

    /**
     * Phương thức thêm phần tử vào hàng đợi(thêm pt vào cuối)
     *
     * @param key
     */
    public void enqueue(String key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    /**
     * Xoá phần tử khỏi hàng đợi(xoá pt đầu).
     */
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}

