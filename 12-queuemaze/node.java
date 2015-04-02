public class node<E>{
 
    private E data;
    private int x,y;
    private node<E> next;

    // no <E> in constructor
    public node(){
	data = null;
	next = null;
    }

    public node(E s){
	data = s;
	next = null;
    }

    public node(int xcor, int ycor){
	x = xcor;
	y = ycor;
    }

    public void setCor(int xcor, int ycor){
	x = xcor;
	y = ycor;
    }

    public int getX(){
	return x;
    }

    public int getY(){
	return y;
    }
    
    public void setData(E s){
	data = s;
    }

    public E getData(){
	return data;
    }

    public void setNext(node<E> n){
	next = n;
    }

    public node<E> getNext(){
	return next;
    }

    public String toString(){
	return ""+data;
    }

}
