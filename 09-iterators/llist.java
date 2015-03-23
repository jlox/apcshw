import java.io.*;
import java.util.*;

public class llist<E> implements Iterable<E>{
    private node<E> l;
    
    public llist(){
	l = new node<E>();
    }
    
    public Iterator<E> iterator(){
	llit<E> i = new llit<E>(l.getNext());
	return i;
    }
    
    public void add(E s){
	node<E> tmp = new node<E>(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
    }
    
    public String toString(){
	String s = "";
	node<E> tmp;;
	for (tmp=l.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
