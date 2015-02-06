public class recursion{

    public int fib(int n){
	if (n<3){
	    return 1;
	} else if (n<0){
	    return -1;
	} else {
	    return fib(n-1) + fib(n-2);
	}
    }
    
    public int len(String s){
	if (s.equals("")){
	    return 0;
	} else {
	    return 1 + len(s.substring(1));
	}
    }

    public int count(String s, char c){
	if (s.equals("")){
	    return 0;
	} else if (s.substring(0, 1).equals(c)){
	    return 1 + count(s.substring(1),c );
	} else {
	    return count(s.substring(1), c);
	}
    }

    public static void main(String[] args){
	recursion r = new recursion();
	System.out.println(r.fib(5));
	System.out.println(r.fib(6));
	System.out.println(r.fib(7));

	System.out.println(r.len("hello")); //5
	System.out.println(r.len("bunnies are nice")); //16
	System.out.println(r.len("they are fluffy"));//15

	System.out.println(r.count("xxxx", 'x'));//4
	System.out.println(r.count("thisx couldx getx weird real quick", 'x'));//3
	System.out.println(r.count("xylophones are hard to spxell", 'o'));//3
    }
}
