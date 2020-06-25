package java_collection_tree_map.bai_tap_duyet_postorder_bst;

import java.util.Stack;

public class TestBST {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();    /*   Stack sẽ lấy 101 làm root; LinkedList sẽ lấy 60 làm root, 2 tree khác nhau.    */
        list.add(60);
        list.add(55);
        list.add(45);
        list.add(57);
        list.add(59);
        list.add(100);
        list.add(67);
        list.add(107);
        list.add(101);
        list.add(50);

        BST<Integer> tree = new BST<>(list);

        System.out.print("Inorder\n");
        tree.inorder();
        System.out.print("\nPostorder\n");
        tree.postorder();
//        System.out.print("\nPreorder\n");
//        tree.preorder();
        System.out.println("\nThe number of node is " + tree.getSize());
    }
}
