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
	int c = 0;
	node l;
	node result = l;
	while (c < n){
	    result = l.getNext();
	    c++;
	}
	return result;
    }
 

    public void insert(int n, String s){
	l.find(n).add(s);
    }
		
}
