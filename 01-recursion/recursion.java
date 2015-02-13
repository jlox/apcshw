public class recursion{

    public int fact(int n){
	if (n<1){
	    return 1;
	} else {
	    return n * fact(n-1);
	}
    }

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

    public int count(String s, String c){ // this is sort of cheating???
	if (s.equals("")){
	    return 0;
	} else if (s.substring(0, 1).equals(c)){
<<<<<<< HEAD
	    return 1 + count(s.substring(1),c));
=======
	    return 1 + count(s.substring(1), c);
>>>>>>> 28969c5ee6fc9592055211569f0ebbaac83cf7e9
	} else {
	    return count(s.substring(1),c);
	}
    }

    //CODINGBAT PROBLEMS

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	} else if ((bunnies % 2) == 0){
	    return 3 + bunnyEars2(bunnies - 1);
	} else {
	    return 2 + bunnyEars2(bunnies - 1);
	}
    }

    public int strCount(String str, String sub) {
	if (str.length() < sub.length()){
	    return 0;
	}
	if (str.substring(0, sub.length()).equals(sub)) {
	    return 1 + strCount(str.substring(sub.length()), sub);
	} else {
	    return strCount(str.substring(1), sub);
	}
    }

    public int sumDigits(int n) {
	if (n == 0){
	    return 0;
	} else {
	    return (n % 10) + sumDigits(n/10);
	}
    }

    public String allStar(String str) {
	if (str.length() <= 1){
	    return str;
	} else {
	    return str.substring(0, 1) + "*" + allStar(str.substring(1));
	}
    }


    public static void main(String[] args){
	recursion r = new recursion();
	System.out.println(r.fact(3));//6
	System.out.println(r.fact(5));//120
	System.out.println(r.fact(7));//5040

	System.out.println(r.fib(5));
	System.out.println(r.fib(6));
	System.out.println(r.fib(7));

	System.out.println(r.len("hello")); //5
	System.out.println(r.len("bunnies are nice")); //16
	System.out.println(r.len("they are fluffy"));//15

	System.out.println(r.count("xxxx", "x"));//4
	System.out.println(r.count("this could get weird real quick", "i"));//3
	System.out.println(r.count("xylophones are hard to spxell", "o"));//3
    }
}
