package Trees.Problems;
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
        left=right=null;
    }

}

public class HeightOfBT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int res = height(root);
        System.out.println(res);
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
}
