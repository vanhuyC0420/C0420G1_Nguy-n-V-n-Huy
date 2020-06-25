package java_collection_tree_map.thuc_hanh_banary_search_tree;

public interface Tree<E> {

    /**Insert element e into the binary search tree*/
    public boolean insert(E e);

    /**Inorder traversal from the roo*/
    public void inorder();

    /**Get the number of nodes in the tree*/
    public int getSize();

}
