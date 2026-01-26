public class LCAinBSTfromorderedinput{
 static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

    // Find LCA in BST
    static int findLCA(Node root, int u, int v) {
        while (root != null) {
            if (u < root.data && v < root.data)
                root = root.left;
            else if (u > root.data && v > root.data)
                root = root.right;
            else
                return root.data;
        }
        return -1; // if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Node root = null;

        for (int i = 0; i < N; i++) {
            root = insert(root, sc.nextInt());
        }

        int U = sc.nextInt();
        int V = sc.nextInt();

        // Ensure U <= V
        if (U > V) {
            int temp = U;
            U = V;
            V = temp;
        }

        System.out.print(findLCA(root, U, V));
    }
}