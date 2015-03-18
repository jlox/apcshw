public class llist {
    
    private node l=null;
    private int len=0;

    public String toString(){
	String s = "";
	node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public void add(int s){
	node tmp = new node(s);
	l = tmp;
	tmp.setNext(l);
	len++;
    }
    
    public void add(int n, int s){
	node newNode = new node(s);
	if(n == 0){
	    newNode.setNext(l);
	    l = newNode;
	} else {
	    node othernode = get(n-1);
	    newNode.setNext(othernode.getNext());
	    othernode.setNext(newNode);
	}
    }	

    public node get(int n){
	node tmp = l;
	int c = 0;
	while(c<n){
	    tmp = tmp.getNext();
	    c++;
	}
	//String s = tmp.getData();
	//return s;
	return tmp;
    }

    public void remove(int n) {
	node prenode = get(n - 1);
	node postnode = get(n + 1);
	prenode.setNext(postnode);
	len--;
    }

    public static void main(String[] args){
	node n = new node(7);
	n.add(6);
    }
}
