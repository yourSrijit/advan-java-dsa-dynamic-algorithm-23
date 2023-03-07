package TreeinJava;

public class Sum_of_Nodes {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int nodeCount(Node root){
        if(root==null){
            return 0;
        }
        int lc=nodeCount(root.left);
        int rc=nodeCount(root.right);
        return  (lc+rc+1);
    }
    public static int sumOfNodes(Node root){
        if(root ==null){
            return 0;
        }
        int sl=sumOfNodes(root.left);
        int sr=sumOfNodes(root.right);
        return (sl+sr+root.data);
    }
    public static void main(String[] args) {

        /*        1
                 /  \
                2    3
               / \  / \
             4    5 6  7
         */

        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        System.out.println("So the height of the tree is "+height(root));
        System.out.println("Number of nodes in the Tree is "+nodeCount(root));
        System.out.println("So the sum of all nodes in tree is "+sumOfNodes(root));

    }
}