package dsa_danh_sach_list.thuc_hanh_linkedlist;

public class LinkedListRepair {
    private Node head;
    private int numNodes;

    public LinkedListRepair(Object data) {
        head = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data){

        if (index == 0){
            addFirst(data);
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes ++;
        }

    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
