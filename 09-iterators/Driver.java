import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {
	llist<String> l = new llist<String>();
	//ArrayList<String> l = new ArrayList<String>();
	//LinkedList<String> l = new LinkedList<String>();

	llist<Integer> l2 = new llist<Integer>();
	// ArrayList<Integer> l2 = new ArrayList<Integer>();
	//LinkedList<Integer> l2 = new LinkedList<Integer>();
				
	l.add("Hello");
	l.add("world");
	l.add("abc");
	l.add("something");
	l.add("else");

	System.out.println(l);

	for (int i=0;i < 5; i++){
	    l2.add(i);
	}

	System.out.println(l2);
	System.out.println();
	Iterator<String> i = l.iterator();
	while (i.hasNext()) {
	    System.out.println(i.next());
	    i.remove();
	    System.out.println(l);
	}

	Iterator<Integer> i2 = l2.iterator();
	while (i2.hasNext()) {
	    System.out.println(i2.next());
	    i2.remove();
	    System.out.println(l2);
	}
    }
}
