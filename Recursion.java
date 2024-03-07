public class Recursion {
	public static void main(String[]agrs) {
		T t1 =new T();
		System.out.println("当n = 7 对应的f数=" + t1.fibonacci(7));
	}
}
class T {

    //请使用递归的方式求出
    //斐波那契数1，1，2，3，5，8，13
    //给你一个整数n，求出他的值是多少
    
	//1 当n = 1 斐波那契数列等于1
	//2 当n = 2 斐波那契数列等于2
	//3 当n >= 3 斐波那契数列等于5
	//
	public int fibonacci(int n) {
		if(n >= 1){ 
		
		if(n == 1|| n == 2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		}else {
			System.out.println("要求输入进去的数1或者2");
			return -1;
	}
}
}


