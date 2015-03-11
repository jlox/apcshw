public class node {

    private String data;
    private node next;

    public node(String s){
	data = s;
    }

    public void setData(String s){
	data = s;
    }

    public String getData(){
	return data;
    }

    public void setNext(node n){
	next = n;
    }

    public node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }

    public static void main(String[] args){
	node n = new node("hello");
	System.out.println(n);

	node n2 = new node("world");
	System.out.println(n2);

	n.setNext(n2);

	System.out.println(n.getNext().getData());
	System.out.println(n.getNext());

	n.getNext().setData("pickle");
	System.out.println(n2);
    }
}
