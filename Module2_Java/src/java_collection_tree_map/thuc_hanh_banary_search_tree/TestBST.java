package java_collection_tree_map.thuc_hanh_banary_search_tree;

public class TestBST {
    public static void main(String[] args) {
        /**create a Binary Search Tree*/
        BST<Integer> tree = new BST<>();
        tree.insert(20);
        tree.insert(22);
        tree.insert(24);
        tree.insert(25);
        tree.insert(55);
        tree.insert(65);
        tree.insert(15);
        tree.insert(10);

//        /**traverse tree*/
//        System.out.println("Inorder (sorted): ");
//        tree.inorder();
//        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
