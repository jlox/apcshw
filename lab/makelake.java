import java.io.*;
import java.io.*;

public class makelake{

    int R = 4, C = 6, E = 22, N = 2;
    int[][] lake;
    int xcor = 1;
    int ycor = 4;
    int depth = 4;
    int xcor2 = 1;
    int ycor2 = 1;
    int depth2 = 10;

    public makelake(){
	int[] L1 = {28, 25, 20, 32, 34, 36};
	int[] L2 = {27, 25, 20, 20, 30, 34};
	int[] L3 = (24, 20, 20, 20, 20, 30};
	int[] L4 = {20, 20, 14, 14, 20, 20};
	lake[0] = L1;
	lake[1] = L2;
	lake[2] = L3;
	lake[3] = L4;
    }

    public void stomp(){
	int[] inst1;
	int count = 0;
	for (int i = xcor; i < xcor + 2; i++){
	    for (int j = ycor; j < ycor + 2; j++){
		inst1[count] = lake[i][j];
		count = count + 1;
	    }
	}
    }

    public int output(){
	int sum = 0;
	for (int i=0; i<R; i++){
	    for (int j=0; j<C; j++){
		if (lake[i][j] > 0){
		    sum = sum + lake[i][j];
		}
	    }
	    i = i+1;
	}
	return sum * 72 * 72;
    }

    /*
    public makelake(){
	Scanner sc = new Scanner(new File("makelake.dat"));
	int j = 0;
	while (sc.hasNext()){
	    String line = sc.nextLine();
	    if (line = 0){
		R = intAt(line, 0);
	    } else if 
		}
    }
    */

    public static void main(String[] args){
	makelake m = new makelake();
	m.stomp();
	System.out.println(m);
    }
}
