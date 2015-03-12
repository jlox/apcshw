import java.util.*;

public class Driver{

    public static void main(String[] args){
	Random r = new Random();
	llist l = new llist();
	for (int i=0; i <10; i++){
	    l.add(r.nextInt(100));
	}
	System.out.println(l);
    }
}
