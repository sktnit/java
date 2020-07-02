package BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AVLNode{
	int key,height;
	AVLNode left,right;
	AVLNode(int key){
		this.key=key;
		height=0;
		left=right=null;
	}
}

class AVLTree{
	AVLNode root;
	
	int height(AVLNode n) {
		if(n==null)
			return -1;
		return n.height;
	}
	
	int max(int a, int b) {
		return (a>b)?a:b;
	}
	
//	right rotate
	AVLNode rightrot(AVLNode y) {
		AVLNode x=y.left;
		
		y.left=x.right;
		x.right=y;
		x.height=1+max(height(x.left),height(x.right));
		y.height=1+max(height(y.left),height(y.right));
		return x;
	}
	
//	left rotate
	AVLNode leftrot(AVLNode y) {
		AVLNode x=y.right;
		y.right=x.left;
		x.left=y;
		x.height=1+max(height(x.left),height(x.right));
		y.height=1+max(height(y.left),height(y.right));
		return x;
	}
	
	int getBF(AVLNode n) {
		if(n==null)
			return 0;
		return height(n.left) - height(n.right);
	}
	
	AVLNode insert(AVLNode node, int key) { 

		/* 1. Perform the normal BST insertion */
		if (node == null) 
			return (new AVLNode(key)); 

		if (key < node.key) 
			node.left = insert(node.left, key); 
		else if (key > node.key) 
			node.right = insert(node.right, key);

		node.height = 1 + max(height(node.left),height(node.right)); 

		int balance = getBF(node); 

		// If this node becomes unbalanced, then there 
		// are 4 cases Left Left Case 
		if (balance == 2 && key < node.left.key) 
			return rightrot(node); 

		// Right Right Case 
		if (balance == -2 && key > node.right.key) 
			return leftrot(node); 

		// Left Right Case 
		if (balance ==2 && key > node.left.key) { 
			node.left = leftrot(node.left); 
			return rightrot(node); 
		} 

		// Right Left Case 
		if (balance == -2 && key < node.right.key) { 
			node.right = rightrot(node.right); 
			return leftrot(node); 
		} 

		/* return the (unchanged) node pointer */
		return node; 
	} 
	
	AVLNode getSucc(AVLNode node) {
		
//		if(node.left==null)
//			return null;
//		
//		node=node.left;
//		
//		while(node.right!=null) {
//			node=node.right;
//		}
//		
//		return node;
		while(node.left!=null)
			node=node.left;
		return node;
	}
	
	AVLNode delete(AVLNode node, int key) {
		// STEP 1: PERFORM STANDARD BST DELETE  
        if (node == null)  
            return node;  
  
        // If the key to be deleted is smaller than  
        // the root's key, then it lies in left subtree  
        if (key < node.key)  
            node.left = delete(node.left, key);  
  
        // If the key to be deleted is greater than the  
        // root's key, then it lies in right subtree  
        else if (key > root.key)  
            node.right = delete(node.right, key);  
  
        // if key is same as root's key, then this is the node  
        // to be deleted  
        else
        {  
  
            // node with only one child or no child  
            if ((node.left == null) || (node.right == null))  
            {  
                AVLNode temp = null;  
                if (temp == node.left)  
                    temp = node.right;  
                else
                    temp = node.left;  
  
                if (temp == null)  
                {  
                    temp = node;  
                    node = null;  
                }  
                else   
                    node = temp; 
            }  
            else
            {   
                AVLNode temp = getSucc(node.right);  
                node.key = temp.key; 
                node.right = delete(node.right, temp.key);  
            }  
        }  
        
        if (node== null)  
            return node;  
    
        node.height = max(height(node.left), height(node.right)) + 1;  
  
        int balance = getBF(node);  
  
        if (balance > 1 && getBF(node.left) >= 0)  
            return rightrot(node);  
  
        if (balance > 1 && getBF(node.left) < 0)  
        {  
            node.left = leftrot(node.left);  
            return rightrot(node);  
        }  
  
        if (balance < -1 && getBF(node.right) <= 0)  
            return leftrot(node);  

        if (balance < -1 && getBF(node.right) > 0)  
        {  
            node.right = rightrot(node.right);  
            return leftrot(node);  
        }  
        return node;
    }
	
	void preOrder(AVLNode node) { 
        if (node != null) { 
            System.out.print(node.key + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    } 
}


public class AVLImplementation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AVLTree avl=new AVLTree();
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(obj.readLine());
		for(int i=0;i<t;i++) {
			int input=Integer.parseInt(obj.readLine());
			avl.root=avl.insert(avl.root, input);
		}
		int del=Integer.parseInt(obj.readLine());
		avl.root=avl.delete(avl.root, del);
		System.out.println();
		avl.preOrder(avl.root);
	}
}
