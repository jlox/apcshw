public class llist {
    
    private node s, e;
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
        s.setNext(tmp);
	tmp.setNext(e);
	e = tmp;
	len++;
    }
    
    public void add(int n, int s){
	node newNode = new node(s);
	node prenode = s;
	for (int i = 0; i < n; i++) {
	    prenode = prenode.getNext();
	}
	newNode.setNext(prenode.getNext());
	prenode.setNext(newNode);
	len++;
    }
	
    //help from Caitlin's code
    public int get(int n){
	if (n >= len || n < 0) {
	    throw new IndexOutOfBoundsException();
	} else {
	    Node tmp = s;
	    int counter = -1;
	    while(counter < n && counter < len) {
		tmp = tmp.getNext();
		counter++;
	    }
	    return tmp.getData();
	}
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
