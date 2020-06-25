package java_collection_tree_map.bai_tap_duyet_postorder_bst;

public interface Tree<E> {

    /**Insert element e into the binary search tree*/
    public boolean insert(E e);

    /**Inorder traversal from the roo*/
    public void inorder();

    /**Get the number of nodes in the tree*/
    public int getSize();

}
