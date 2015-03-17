public class llist {
    
    private node l=null;

    public void add(String s){
	node tmp = new node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public node find(int n){
	node tmp = l;
	int c = 0;
	while(c<n){
	    tmp = tmp.getNext();
	    c++;
	}
	return tmp;
    }
 

    public void insert(int n, String s){
	node newNode = new node(s);
	if(n == 0){
	    newNode.setNext(l);
	    l = newNode;
	} else {
	    node othernode = find(n-1);
	    newNode.setNext(othernode.getNext());
	    othernode.setNext(newNode);
	}
    }
		
}
