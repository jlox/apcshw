import java.io.*;
import java.util.*;
import java.util.*;

/* NOTES
select takes the A (array), k (kth smallest element), lower/upper bound.
select(A, 3rd, 0, 9) --> look for third element through 0 and 9 - know not 
in the upper half of the list (9+)
     first time: lower = 0, upper = array length - 1
1. select pivot value 
2. swap pivot value with value in A[high]
3. low index(Li) = low, high index = high - 1
3, 8(low index), 12, 4, 5, 9, 10, 2, 7(high index), 6(pivot)
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
	int pivot = A[L];
	A[L] = A[H];
	A[H] = pivot;
	
    }

    public static void main(String[] args){
	selection s = new selection();
	int[] test = new int[]{3, 2, 6, 8, 4, 7, 12};
	System.out.println(s.partition(test, 2, 5));
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
