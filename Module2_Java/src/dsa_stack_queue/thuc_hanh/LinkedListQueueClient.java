package dsa_stack_queue.thuc_hanh;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue("huy");
        queue.enqueue("q");
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("a");
        queue.enqueue("s");
        queue.enqueue("d");
        System.out.println("Dequeued item is " + queue.dequeue().key);// In ra giá trị của phần tử bị xoá
//        queue.dequeue();
//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
