package java_collection_tree_map.bai_tap_duyet_postorder_bst;

import java.util.Stack;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] object) {
        for (int i = 0;i<object.length; i++)
            insert(object[i]);
    }

    public BST(Stack<E> stack) {
        while (!stack.isEmpty()){
            insert(stack.pop());
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }
    /**Cài đặt phương thức duyệt cây theo thứ tự inorder*/
    @Override
    public void inorder() {
        inorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    @Override
    public void postorder(){
        postorder(root);
    }


    protected void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }



}
