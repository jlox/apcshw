import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class selection {
    public void partition(int[] L, int SI, int EI){
	int[] D = new int[L.length];
	int n = 0;
	while (n < L.length - 1){ // copy over elements
	    if (n < SI){
		D.add(L[n]);
		n = n + 1;
	    } else if (n > EI){
		D.add(L[n]);
		n = n + 1;
	    } else {
		n = n + 1;
	    }
	}
	int pivot = (L[SI]);
	SI = SI + 1;
	while (SI < EI){
	    if (L[SI] < pivot){
		D.insert(SI, L[SI]);
		SI = SI + 1;
	    } else {
		D.insert(EI, L[SI]);
		SI = SI + 1;
	    }
	}
	D.insert(SI, pivot);
	    }

    public static void main(String[] args){
	selection s = new selection();
	int[] test = new int[]{3, 2, 6, 8, 4, 7, 12};
	System.out.println(s.partition(test, 2, 5));
    }
}

