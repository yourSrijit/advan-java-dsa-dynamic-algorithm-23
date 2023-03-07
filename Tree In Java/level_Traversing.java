package TreeinJava;

import java.util.LinkedList;
import java.util.Queue;

public class level_Traversing {
    static class Node{
          Node left;
          Node right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node buildTree(int Nodes[]){
        idx++;
        if(Nodes[idx]==-1){
            return null;
        }
        Node new_node=new Node(Nodes[idx]);
        new_node.left=buildTree(Nodes);
        new_node.right=buildTree(Nodes);
        return new_node;
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node cur=q.remove();
            if(q==null){
                System.out.println();
                if(!q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.println(cur.data+" ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int Nodes[]={5,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        level_Traversing ob =new level_Traversing();
        Node root =ob.buildTree(Nodes);
        levelOrder(root);

    }
}
