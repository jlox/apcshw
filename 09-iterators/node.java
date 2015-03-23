public class node<E>{
    
    private E data;
    private node<E> next;
    
    public node(){
	data = null;
	next = null;
    }

    public node(E s){
	data = s;
	next = null;
    }

    public void setData(E s){
	data = s;
    }

    public E getData(){
	return data;
    }

    public void setNext(node<E> n){
	next = n;
    }

    public node<E> getNext(){
	return next;
    }

    public String toString(){
	return ""+data;
    }
}
