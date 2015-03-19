public class llit{
    private node l;
    public llit(node n){
	l = n.getNext();
    }

    public boolean hasNext(){
	return l != null;
    }

    /*
mote to the next node and return teh value in the node (before the move)
    */
    public String next(){
	String s = l.getData();
	l = l.getNext();
	return s;
    }
}
