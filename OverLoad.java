public class OverLoad {
	public static void main(String[] agrs) {
		Mycalculator mc =new Mycalculator();
		System.out.print(mc.calculator(3.2*2 , 3));
	}
}
class Mycalculator {
	
	public int calculator(int n1, int n2){
		return n1 + n2;
	}
	public double calculator(int n1, double n2) {
		return n1 + n2 ;
	}
	public double calculator(double n2, int n1) {
		return n2 + n1;
	}
	public int calculator(int n1, int n2 , int n3) {
		return n1 + n2 + n3;
	}
}