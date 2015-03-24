public class Driver{
    public static void main(String[] args){
	myStack<Integer> boo = new myStack<Integer>();
	System.out.println(boo.empty());
	boo.push(7);
	boo.push(3);
	boo.push(2);
	boo.push(1);
	boo.push(8);
	System.out.println(boo);
	System.out.println(boo.pop());
	System.out.println(boo.peek());
	System.out.println(boo.pop());
	System.out.println(boo);
	System.out.println(boo.empty());

	myAStack foo = new myAStack();
	System.out.println(foo.empty());
	foo.push(7);
	foo.push(3);
	foo.push(2);
	foo.push(1);
	foo.push(8);
	System.out.println(foo);
	System.out.println(foo.pop());
	System.out.println(foo.peek());
	System.out.println(foo.pop());
	System.out.println(foo);
	System.out.println(foo.empty());
    }
}
