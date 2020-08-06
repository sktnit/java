import java.util.Scanner;
import java.util.Stack;
class Node{
	int key;
	Node left,right;
	public Node(int item) {
		key=item;
		left=right=null;
	}
}
class BinaryTree{
	Node root;
	BinaryTree(int key){
		root=new Node(key);
	}
	BinaryTree(){
		root=null;
	}
	void display() {
		if(root==null) return ;
		Stack<Node> ns= new Stack<Node>();
		ns.push(root);
		while(ns.empty()==false) {
			Node top=ns.peek();
			System.out.println(top.key);
			ns.pop();
			if (top.right != null)
				ns.push(top.right);
			if (top.left != null)
				ns.push(top.left);
		}
	}
}
public class BinaryTreeImplementation {

	public static void main(String[] args) {
		
		BinaryTree obj=new BinaryTree();
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		obj.root=new Node(t);
		t=sc.nextInt();
		System.out.println();
		obj.root.left=new Node(t);
		t=sc.nextInt();
		obj.root.right=new Node(t);
		obj.display();
	}

}
