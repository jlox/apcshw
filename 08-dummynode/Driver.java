import java.io.*;
import java.util.*;
import java.lang.System;

public class Driver{
    public static void main(String[] args){
	long t = System.currentTimeMillis();
	System.out.println(t);

	long start, elapsed, start2, elapsed2, start3, elapsed3;
	long ai = 0;
	long lli = 0;
	long lii = 0;

	start = System.currentTimeMillis();
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0; i<1000; i++){
	    int ra = r.nextInt(10);
	    a.add(ra);
	    ai = ai + ra;
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println(elapsed);

	start2 = System.currentTimeMillis();
	llist n = new llist();
	for (int i=0; i<999; i++){
	    int rll = r.nextInt(10);
	    n.add(rll);
	    lli = lli + rll;
	}
	elapsed2 = System.currentTimeMillis()-start2;
	System.out.println(elapsed2);
    }
}
