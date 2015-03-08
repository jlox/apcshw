import java.io.*;
import java.util.*;
import java.util.*;
import java.util.Arrays;

/* NOTES
select takes the A (array), k (kth smallest element), lower/upper bound.
select(A, 3rd, 0, 9) --> look for third element through 0 and 9 - know not 
in the upper half of the list (9+)
     first time: lower = 0, upper = array length - 1
1. select pivot value 
2. swap pivot value with value in A[high]
3. low index(Li) = low, high index = high - 1
4. 8(low index), 12, 4, 5, 9, 10, 2, 7(high index), 6(pivot)
while Li < Hi{
     if A[Li] < P, Li ++ (the number is already below the pivot)
     else swap A[Li] and A[Hi], Hi --
 } // swap A[H] with first "right side" element
if pivot is at k, we're done
else 
either 
select(a, k, L, pivot-1 index) (if k is lower than the pivot index) 
or
select(a, k, pivot index, H) (if k is higher than the pivot index)
*/
    
public class selection {

    public int select(int[] A, int k, int L, int H){
	// SORT STUFF
	int pivot = A[L];
	A[L] = A[H];
	A[H] = pivot; // 2: swaps pivot with A[high]
	int Li = L;
	int Hi = H - 1; // 3
	int temp = 0;
	while (Li < Hi){
	    if (A[Li] < pivot){
		Li = Li + 1;
	    } else {
		temp = A[Li];
		A[Li] = A[Hi];
		A[Hi] = temp;
		Hi = Hi - 1;
	    }
	}
	if (Li == 0){
	    A[H] = A[Li + 1];
	    A[Li + 1] = pivot;
	} else {
	    A[H] = A[Hi];
	    A[Hi] = pivot;
	}
	
	// RECURSIVE PART
	int indexOfPivot = Arrays.asList(A).indexOf(pivot);
	if (indexOfPivot == k){
	    return pivot;
    } else if (indexOfPivot < k){
	    select(A, k, L, indexOfPivot - 1);
	} else {
	    select(A, k, indexOfPivot, H);
	}

	return pivot;
    }	


    public static void main(String[] args){
	selection s = new selection();
	int[] test = new int[]{3, 2, 6, 8, 4, 7, 12};
	int[] test2 = new int[]{7, 3, 6, 12, 8, 4, 22, 5};
	int[] test3 = new int[]{5, 8, 7, 6, 9, 4, 3, 2, 1};
	// should return 2, 3, 6, 8, 4, 7, 12
	// 5, 3, 6, 4, 7, 22, 12, 8
	// 1, 2, 3, 4, 5, 6, 7, 8, 9
	System.out.println(s.select(test, 2, 0, 6));
	System.out.println(s.select(test2, 2, 0, 7));
	System.out.println(s.select(test3, 2, 0, 8));
    }
}




/* OLD CODE
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
*/
