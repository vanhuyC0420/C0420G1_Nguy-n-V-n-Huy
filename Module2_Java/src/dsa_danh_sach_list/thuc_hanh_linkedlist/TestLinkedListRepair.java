package dsa_danh_sach_list.thuc_hanh_linkedlist;

public class TestLinkedListRepair {
    public static void main(String[] args) {
        System.out.println("/=/ TESTING =/=");
        LinkedListRepair ll = new LinkedListRepair(10);
        ll.addFirst(11);
        ll.add(0,12);

        ll.printList();
    }
}
