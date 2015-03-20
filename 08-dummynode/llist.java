import java.io.*;
import java.util.*;

public class llist<E> implements Iterable<E> {
    
    private node start, end;
    private int len=0;

    public Iterator<E> iterator()(){
	llit<E> i = new llit<E>(l.getNext());
	return i;
    }
    
    public llist(){
	start = new node(0); // make dummy node???
    }
    
    public String toString(){
	String s = "";
	Node<E> tmp;;
	for (tmp=l.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public void add(E s){
	Node<E> tmp = new Node<E>(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
    }
    /*
    public void add(int s){
	node tmp = new node(s);
        start.setNext(tmp);
	tmp.setNext(end);
	end = tmp;
	len++;
    }
    */
    public void add(int n, int s){
	node newNode = new node(s);
	node prenode = start;
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
	    node tmp = start;
	    int counter = -1;
	    while(counter < n && counter < len) {
		tmp = tmp.getNext();
		counter++;
	    }
	    return tmp.getData();
	}
    }

    /*
    public void remove(int n) {
	node prenode = get(n - 1);
	node postnode = get(n + 1);
	prenode.setNext(postnode);
	len--;
	}
    */

    public int removei(int n) {
	node tmp = start;
	for (int i = 0; i < n; tmp = tmp.getNext()) {
	    if (tmp.getNext() == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	node result = tmp.getNext();
	tmp.setNext(tmp.getNext().getNext());
	len--;
	return result.getData();
    }
    
    public boolean remove(int n){
	node tmp = start;
	while (tmp.getNext() != null) {
	    if (tmp.getNext().getData() == n) {
		tmp.setNext(tmp.getNext().getNext());
		return true;
	    }
	    tmp = tmp.getNext();
	}
	return false;
    }
}
