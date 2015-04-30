public class tree {

    public Node search (Node T, Integer i){
	int c = T.getData().compareTo(i);
	while (T!=null){
	    if (c>0){
		T = T.getRight();
	    } else if (c<0){
		T = T.getLeft();
	    } else {
		return T;
	    }
	}
    }

    public void insert (Node n, Integer i){
	Node t = new Node(i);
	Node t2 = new Node();
	while (t != null){

	}
    }
}
