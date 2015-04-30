public class Node {
    private int data;
    private Node left, right;

    // constructor???

    public Node(int n){
	data = n;
    }

    public int getData(){
	return data;
    }

    public Node getLeft(){
	return left;
    }

    public void setLeft(Node n){
	left = n;
    }

    public Node getRight(){
	return right;
    }

    public void setRight(Node n){
	right = n;
    }
		
}

