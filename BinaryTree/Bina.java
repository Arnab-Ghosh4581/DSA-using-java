package BinaryTree;
public class Bina
{
	public static class Node{
	   int data;
	   Node left;
	   Node right;
	   Node(int data){
	       this.data=data;
	       this.left=null;
	       this.right=null;
	   }
	}
	public static class Binary{
	    static int idx=-1;
	    public static Node create(int[] a){
	        idx++;
	        if(a[idx]==-1){
	            return null;
	        }
	        Node newNode=new Node(a[idx]);
	        newNode.left=create(a);
	        newNode.right=create(a);
	        return newNode;
	    }
	}

	public static void preorder(Node root){
		if(root==null) return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root){
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void main(String[] args){
	    int[] a={1,2,-1,-1,3,-1,-1};
	    Binary b=new Binary();
	    Node root=b.create(a);
	    System.out.println(root.data);
		//preorder(root);
		inorder(root);
	}

	
}