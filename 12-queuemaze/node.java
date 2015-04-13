public class node{
 
    private int x,y;
    private node prev;
    
    public node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public node getPrev(){
	return prev;
    }

    public void setPrev(node n){
	prev=n;
    }
    public int getX(){
	return x;
    }

    public int getY(){
	return y;
    }
}
