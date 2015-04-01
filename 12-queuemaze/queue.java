import java.util.*;

public class queue<E> {

    private node<E> head;
    private node<E> tail;
    private int size;

    public queue(){
	head = new node<E>();
	tail = head;
    }

    public void enqueue(E data){
	node<E> tmp = new node<E>(data);
	if (size == 0){
	    head = tmp;
	    tail = tmp;
	}
	else {
	    tail.setNext(tmp);
	    tail = tmp;
	}
	size++;
    }

    public E dequeue(){
	if (empty())
	    throw new NoSuchElementException();
	E data = head.getData();
	head = head.getNext();
	size--;
	return data;
    }

    public boolean empty(){
	return ((head == tail) && (head.getData() == null));
    }

    public E head(){
	if (empty())
	    throw new NoSuchElementException();
	E data = head.getData();
	return data;
    }

    public int size(){
        return size;
    }

    public String toString(){
	String s = "";
	node<E> iter = head;
	while (iter != null){
	    s+= iter + " --> ";
	    iter = iter.getNext();
	}
	return s;
    }

}
