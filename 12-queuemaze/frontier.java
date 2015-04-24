import java.util.*;

public class frontier {
    public LinkedList<node> l = new LinkedList<node>();

    public void add(node n){
	l.add(n);
    }

    public node remove(){
	node r = l.remove();
	return r;
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}
