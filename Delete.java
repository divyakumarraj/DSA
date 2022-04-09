import java.util.Scanner;

public class Delete {
    static Node root;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void insert(Node temp,int data){
        if(root==null){
            root=new Node(data);
            return;
        }
        if(temp.data>data){
            if(temp.left==null){
                temp.left= new Node(data);
            }
            else {
                insert(temp.left,data);
            }
        }
        if(temp.data<data){
            if (temp.right==null){
                temp.right=new Node(data);
            }
            else {
                insert(temp.right,data);
            }
        }
        return;

    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static int min(Node root){
        if (root.left == null){
            return root.data;
        }
        return min(root.left);
    }
    public static Node deleteNode(Node root,int val){
        if (root==null){
            return null;
        }
        else if (val<root.data){
            root.left=deleteNode(root.left,val);
        }
        else if(val>root.data){
            root.right=deleteNode(root.right,val);
        }
        else {
            if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            else if (root.left == null && root.right==null){
                return null;
            }
            else {
                int minimum =min(root);
                root.data =minimum;
                deleteNode(root.right,minimum);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Delete obj =new Delete();
        Scanner sc= new Scanner(System.in);
        System.out.println("total no of nodes");
        int n= sc.nextInt();
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            obj.insert(obj.root,sc.nextInt());
        }
        System.out.println("inorder traiversal");
        inorder(root);
        System.out.println();
        System.out.println("insert the delete element");
        obj.deleteNode(obj.root,sc.nextInt());
        System.out.println("in order traiversaal");
        obj.inorder(root);
    }
}
