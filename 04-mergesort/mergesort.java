import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class mergesort{

    public ArrayList<Integer> sort(ArrayList<Integer> L){
	ArrayList<Integer> result = new ArrayList<Integer>();
	// ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> a = new ArrayList<Integer>(L.subList(0, (L.size()/2)));
	// ArrayList<Integer> b = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>(L.subList((L.size()/2), L.size() - 1));
	ArrayList<Integer> r1 = new ArrayList<Integer>();
	ArrayList<Integer> r2 = new ArrayList<Integer>();
	if (L.size() == 1){
	    return a;
	    return b;
	} else {
	    r1 = sort(a);
	    r2 = sort(b);
	}
	return merge(r1, r2);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> result = new ArrayList<Integer>();
	if (A.get(A.size()-1) < B.get(0)){
	    result.addAll(A);
	    result.addAll(B);
	} else if (B.get(B.size()-1) < A.get(0)){
	    result.addAll(B);
	    result.addAll(A);
	} else {
	    while ((A.size()>0) && (B.size()>0)){
		if (A.get(0) < B.get(0)){
		    result.add(A.get(0));
		    A.remove(0);
		    A.trimToSize();
		} else {
		    result.add(B.get(0));
		    B.remove(0);
		    B.trimToSize();
		}
	    }
	    if (A.size() == 0){
		result.addAll(B);
	    } else {
		result.addAll(A);
	    }
	}
	return result;
    }

    public static void main(String[] args){
	mergesort m = new mergesort();
	/* ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(7);
	a.add(13);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(4);
	b.add(5);
	b.add(24);
	*/
	ArrayList<Integer> L = new ArrayList<Integer>();
	L.add(6);
	L.add(27);
	L.add(4);
	L.add(16);
	L.add(7);
	L.add(396);
	L.add(104);
	System.out.println(L);
	System.out.println(m.sort(L));
    }
}

