import java.io.*;
import java.util.*;
import java.util.Arrays;

public class amergesort{
    public int[] merge(int[] a, int[] b){
	int[] merged = new int[a.length + b.length];
	int ia = 0;
	int ib = 0;
	int i = 0;
	while (i < a.length + b.length){
	    if (ia < a.length && ib < b.length){
		if (a[ia] <= b[ib]){
		    merged[i] = a[ia];
		    ia = ia + 1;
		} else {
		    merged[i] = b[ib];
		    ib = ib + 1;
		}
	    } else if (ia < a.length) {
		merged[i] = a[ia];
		ia = ia + 1;
	    } else {
		merged[i] = b[ib];
		ib = ib + 1;
	    }
	    i = i + 1;
	}
	return merged;
    }

    public int[] sort(int[] n){
  	int[] a = new int[n.length/2];
	int[] b = new int[n.length - n.length/2];
	if(n.length <= 1){
	    return n;
	} else {
	    int ib = 0;
	    int i = 0;
	    while (i < n.length){
		if(i < n.length/2){
		    a[i] = n[i];
		}
		else {
		    b[ib] = n[i];
		    ib++;
		}
		i = i + 1;
	    }
	    n = merge(sort(a),sort(b));
	}
	return n;
    }

    public static void main(String[] args){

	amergesort m = new amergesort();
	int[] L = new int[7];
	L[0] = 6;
	L[1] = 27;
	L[2] = 4;
	L[3] = 16;
	L[4] = 7;
	L[5] = 396;
	L[6] = 104;
	System.out.println(Arrays.toString(L));
	System.out.println(Arrays.toString(m.sort(L)));

    }

}
