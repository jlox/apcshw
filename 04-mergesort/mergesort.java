import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class mergesort{

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> result = new ArrayList<Integer>();
	if (A.get(A.size()-1) < B.get(0)){
	    result.addAll(A);
	    result.addAll(B);
	} else if (B.get(B.size()-1) < A.get(0)){
	    result.addAll(B);
	    result.addAll(A);
	} else {
	    while ((A.size()>0) || (B.size()>0)){
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
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(7);
	a.add(13);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(4);
	b.add(5);
	b.add(24);
	System.out.println(m.merge(a, b));
    }
}

