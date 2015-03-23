import java.io.*;
import java.util.*;

public class llit<E> implements Iterator<E>{

    private node<E> t;
    private node<E> before;
    private boolean next = false;
    private boolean remove = false;

    public llit(node<E> n){
	t = n;
    }

    public boolean hasNext(){
	return t.getNext() != null;
    }

    public E next(){
	E retval = t.getNext().getData();
	before = t;
	t = t.getNext();
	next = true;
	remove = false;
	return retval;
    }

    public void remove() {
	if ((next == true) && (remove == false)) {
	    before.setNext(t.getNext());
	    System.out.println(before);
	    System.out.println(t.getNext());
	    remove = true;
	}  
    }
}
