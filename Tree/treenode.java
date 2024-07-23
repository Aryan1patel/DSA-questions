package question.Tree;

import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
}

class binaryTree{

    TreeNode root; 

    public binaryTree(){
        this.root=null;      // auto creat
    }









}

public class treenode {

    private static void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    private static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Node tree = new Node(1);

        tree.left= new Node(2);
        tree.right= new Node(3);
        tree.left.left= new Node(4);
        tree.left.right= new Node(5);
        tree.right.left= new Node(6);
        tree.right.right= new Node(7);

        inOrderRec(tree);
        System.out.println("");
        preOrder(tree);
        System.out.println("");
        postOrder(tree);

        
        
    }
    
}
