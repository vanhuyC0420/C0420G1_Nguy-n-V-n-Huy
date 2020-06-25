package java_collection_tree_map;

public class BinarySearchTree1 {
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;      // Root của cây

    BinarySearchTree1()      // Root của cây
    {
        root = null;
    }

    // Gọi phương thức deleteRec
    void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }

    /* Hàm đệ qui để xóa phần tử khỏi mảng */
    Node deleteRec(Node root, int key)
    {
        if (root == null)  return root;     /* trường hợp gốc : nếu node root null */

        if (key < root.key)         /* ngược lại chúng ta sẽ duyệt dọc cây  */
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else            // nếu key có cùng giá trị với node key thì chính là node cần xóa
        {
            if (root.left == null)          // node không có hoặc chỉ có 1 node con
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);        // node có 2 node con.

            root.right = deleteRec(root.right, root.key);       // Xóa phần từ nhỏ nhất bên phải
        }

        return root;
    }

    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Gọi phương thức insert
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    /** Hàm đệ qui thực hiện việc chèn phần từ vào cây */
    Node insertRec(Node root, int key)
    {
        /** nếu cây rỗng trả về node mới */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
        if (key < root.key)     /* ngược lại sẽ thực hiện duyệt dọc cây */
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* trả về cây nhị phân đã được thêm phần tử mới */
        return root;
    }

    void inorder()          // Phương thức gọi hàm sắp xếp
    {
        inorderRec(root);
    }

    // hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree1 tree = new BinarySearchTree1();

       /* Let us create following BST
             50
          /     \
         30      70
        /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}
