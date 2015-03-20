import java.io.*;
import java.util.*;

public class llit<E> implements Iterator<E>{
    private node<E> t;
    
    public llit(node<E> n){
	t = n;
    }

    public boolean hasNext(){
	return t != null;
    }

    /*
move to the next node and return the value in the node (before the move)
    */
    
    public E next(){
	E retval = t.getData();
	t = t.getNext();
	return retval;
    }

    public void remove(){

    }
}
