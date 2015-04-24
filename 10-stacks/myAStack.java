import java.io.*;
import java.util.*;
import java.util.Arrays;

public class myAStack{
    private int[] a;
    private int top;

    public myAStack(){
	a = new int[1];
	top = -1;
    }

    public void grow(){
	int len = a.length +1;
	int[] b = new int[len];
	a = b;
    }

    public boolean needGrow(){
	return (top == (a.length - 1));
    }

    public void push(int data){
	grow();
	a[top+1] = data;
	top++;
    }

    public int pop(){
	int data = a[top];
	a[top] = 0;
	top--;
	return data;
    }

    public boolean empty(){
	return (top == 0);
    }

    public int peek(){
	return a[top];
    }

    public String toString(){
	return Arrays.toString(a);
    }
    
}
