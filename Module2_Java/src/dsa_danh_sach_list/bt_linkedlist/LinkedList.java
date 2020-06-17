package dsa_danh_sach_list.bt_linkedlist;

public class LinkedList<E> {

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

    private Node head; // Phần tử đầu tiên của danh sách liên kết.
    private int numNodes = 0; //số lượng phần tử trong danh sách.

    public LinkedList(){
    }

    public void addFirst(E element){
        Node temp = head;  // Khai báo 1 biến là temp trỏ đến giá trị của head
        head = new Node(element); // Biến head sẽ nhận gía trị của 1 node mới.
        head.next = temp;  // head.next trỏ đến temp
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;  // khia báo biến temp trỏ đến head.
        // sẻ cho con trỏ chạy đến phần tử cuối cùng của danh sách.
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp = head;    // khai báo biến temp trỏ đến head.
        Node holder;    // Khai báo 1 biến node là holder.
        // cho con tor chạy đến vị trí index - 1.
        if (index==0){
            addFirst(element);
        } else {
            for (int i =0;i<index-1 && temp.next != null;i++){
                temp = temp.next;
            }
            holder = temp.next;   //cho holder tham chiếu đến node tại vị trí index
            temp.next = new Node(element);      //Node tại vị trí index -1  sẽ trỏ tới node mới
            temp.next.next = holder;     // node mới trỏ đến holder
            numNodes++;     // tăng số lương phần tử trong danh sách lên 1
        }

    }

    public Object get(int index){
        // khai báo biên temp trỏ tới head
        Node temp = head;
        for (int i = 0; i< index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNodes;
    }

    public E remove(int index){
        if (index < 0 || index > numNodes){
            throw new IndexOutOfBoundsException("Error index: "+index);
        }
        // Khai báo biến temp trỏ đến head
        Node temp = head;

        Object data;
        if (index == 0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i =0; i<index-1 && temp.next != null;i++){
                temp=temp.next;
            }
            data=temp.next.next;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element){
        // remove dối tượng nếu element head
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            // khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null){
                //Nếu như tồn tại 1 phần tử bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }
//  hàm sao chép các phần tử của danh sách.
    public LinkedList<E> clone(){
    // kiểm tra linkedlist có phần tử hay không.
        if (numNodes == 0){
            throw new NullPointerException("LinkedList này null");
        }
        // khai báo linkedlist trả về.
        LinkedList<E> returnLinkedList = new LinkedList<>();
        // khai báo 1 temp trỏ đến head
        Node temp = head;
        returnLinkedList.addFirst((E) temp.data);       // add temp vào danh sách trả về
        temp = temp.next;
        while (temp != null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
     }

     // Phương thức kiểm tra xem đối số truyền vào có tồn tại trong danh sách không.
     public boolean constrains(E element){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
     }
    // kiểm tra xem phần tử nằm ở vị trí thứ mấy.
     public int indexOf(E element){
        Node temp = head;
         for (int i = 0; i < numNodes; i++) {
             if (temp.getData().equals(element)){
                 return i;
             }
             temp = temp.next;
         }
         return -1;
     }

     // Xoá danh sách.
     public void clear(){
        Node temp = head;
        head = null;
         for (int i = 0; i < numNodes; i++) {
             temp.next=null;
         }
         numNodes = 0;
//         System.out.println("Hello!!");
     }

     public Object getIndex(int index){
        Node temp = head;
         for (int i = 0; i < index; i++) {
             temp = temp.next;
         }
         return temp.data;
     }

}
