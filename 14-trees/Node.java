public class Node{
		private int data;
		private Node left,right;

		public void setLeft(Node n){
				left = n;
		}
		public void setRight(Node n){
				right = n;
		}
		public Node getLeft(){
				return left;
		}
		public Node getRight(){
				return right;
		}
		public int getData(){
				return data;
		}

		public Node(int n){
				data = n;
		}
		public Node(int n,Node l, Node r){
				data = n;
				left = l;
				right = r;
		}
		public String toString(){
				return ""+data;
		}

}






<<<<<<< HEAD
    public Node(int n){
	data = n;
    }

    public int getData(){
	return data;
    }

    public Node getLeft(){
	return left;
    }
=======
>>>>>>> d1b25d43d295cf6a58c095baca2e34e99bd98247




