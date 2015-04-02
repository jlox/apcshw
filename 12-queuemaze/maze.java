import java.io.*;
import java.util.*;

public class maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    

	/*
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}

	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}

	delay(100);
	System.out.println(this);
	board[x][y]=me;
	node up = new node(x, y+1);
	node down = new node(x, y-1);
	node left = new node(x-1, y);
	node right = new node(x+1, y);
	if (board[x][y+1] != '.'){
	    frontier.enqueue(up);
	} else if (board[x+1][y] != '.'){
	    frontier.enqueue(right);
	} else if (board[x][y-1] != '.'){
	    frontier.enqueue(down);
	    } else if (board[x-1][y] != '.'){
	    frontier.enqueue(left);
	    }
	    if(!solved){
	    frontier.dequeue();
	    }
	    while
	*/

		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
		
    public void solve(int x, int y){
	node start = new node(x, y);
	node n = new node()<char>;
	queue frontier = new queue();

	frontier.enqueue(start);
	
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}

	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}

	board[x][y]=me;
	
	while(!frontier.empty()){
	    n = frontier.dequeue();
	    if(board[n.getX()][n.getY()] == exit){
		return;
	    }
	    
	    board[x][y]=me;

	    if (board[x][y+1] != '.'){
		node up = new node(x, y+1);
		frontier.enqueue(up);
	    } else if (board[x+1][y] != '.'){
		node right = new node(x+1, y);
		frontier.enqueue(right);
	    } else if (board[x][y-1] != '.'){
		node down = new node(x, y-1);
		frontier.enqueue(down);
	    } else if (board[x-1][y] != '.'){
		node left = new node(x-1, y);
		frontier.enqueue(left);
	    }
	}





	public static void main(String[] args){
	    maze m = new maze();
	    System.out.println(m);
	    m.solve(1,1);
	    System.out.println(m);
	}
}
