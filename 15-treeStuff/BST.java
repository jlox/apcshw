import java.io.*;
import java.util.*;
public class BST{
    Node r;

    public String toString(){
	return traverse(r);
    }

    public String traverse(Node t){
	String s = "";
	if (t==null){
	    return "";
	} else {
	    s = s + traverse(t.getLeft())
		+ t.getData() + ", " 
		+ traverse(t.getRight());
	    return s;
	}
    }

    /*
      1. get a pointer T to the node to delete and its parent T2
      (same thing as search part of insert, but you stop at the node to delete.)
      a) T is a leaf - point T2's left or right to null
      b) T has one child - point T2's left or right to T's only child
      c) T has two children
         Find the largest in the left subtree or the smallest in the right
	 L = L.getLeft()
	 while (L.getRight()!=null){
	       L = L.getRoght();
	 }
	 copy the data from L into T
	 remove(T.getLefT(), L.getData())
    */

    public void remove(Node T, int data){
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==data)
		return;
	    else if (t.getData() < data)
		t=t.getRight();
	    else if (t.getData() > data)
		t=t.getLeft();
	    else
		return;
	}

	if (t.getLeft() == null && t.getRight() == null){
	    if (t.getData() > t2.getData()){
		t2.setRight(null);
	    } else {
		t2.setLeft(null);
	    }
	} else if (t.getLeft() == null && t.getRight() != null){
	    t2.setRight(t.getRight());
	} else if (t.getRight() == null && t.getLeft() != null){
	    t2.setLeft(t.getLeft());
	}
    }
    
    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

		

    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
	System.out.println(t.toString());
    }
}


