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
	node tmp;
	node result = tmp;
	while (c < n){
	    result = tmp.getNext();
	    c++;
	}
	return result;
    }
 

    public void insert(int n, String s){
	int c = 0;
	node tmp;
	tmp.find(n).add(s);
    }
		
}
