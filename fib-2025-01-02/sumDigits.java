import java.util.*;
public class sumDigits {
	static Map<Integer, Integer> fibmap = new HashMap<>();
	public static int fib(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}
		if(fibmap.containsKey(n)){
			return fibmap.get(n);
		}
		fibmap.put(n, fib(n-1) + fib(n-2));
		return fibmap.get(n);
	}
	public static int sumDigits(int n){
		return sdWrapped(n, (int)Math.log10(n));
	}
	public static int sdWrapped(int n, int b){
		if(b==0){
			return n; //digit # = 1
		}else{
			return (n / (int)Math.pow(10, b)) + sdWrapped(n % (int)Math.pow(10, b), --b);
		}
	}
	public static int getDigit(int n, int b){
		return (n / (int)Math.pow(10, b))%(int)Math.pow(10, b);
	}
	public static void main(String[] args){
		//System.out.println(sumDigits(251));
		//System.out.println(sumDigits(123));
		//System.out.println(getDigit(14923, 1)); // 2
		System.out.println("Recursively calculating the " + args[0] + "nth fibonacci number");
		System.out.println(fib(Integer.parseInt(args[0])));
	}
}
