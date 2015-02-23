import java.io.*;
import java.util.*;

public class knightsTour{
    private int[][] board;
    private int size;
    private boolean solved = false;
    private int me = 1;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public knightsTour(){
	size = 5;
	int r = 0;
	int c = 0;
	board = new int[size+4][size+4];
	if (((r<2)&&(c<2)) || ((r>(size-2))&&(c>(size-2)))){
	    board[r][c] = -1;
	} else {
	    board[r][c] = 0;
	}
    }

    public void find(){
	int r = 0;
	int c = 0;
	boolean result = false;
	while (r<size+4){
	    while (c<size+4){
		if (board[r][c] == 0){
		    result = true;
		}
		c = c+1;
	    }
	    r = r+1;
	}
        if (result = true){
	    solved = false;
	} else {
	    solved = true;
	}
    }

    public void solve(int x, int y){
	if((board[x][y] == me) || (board[x][y]!=0 ) || solved){
	    return;
	}
	find();
	delay(100);
	System.out.println(this);
	board[x][y] = me;
	solve(x-2, y+1);
	solve(x+2, y+1);
	solve(x-2, y-1);
	solve(x+2, y-1);
	solve(x+1, y+2);
	solve(x-1, y+2);
	solve(x+1, y-2);
	solve(x-1, y-2);
    }

    public static void main(String[] args){
	knightsTour k = new knightsTour();
	System.out.println(k);
	k.solve(2,2);
	System.out.println(k);
    }
}
