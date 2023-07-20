public class BitOperator {
	
	public static void main(String[] args) {
		
		
		int a = 1 >> 2;
		//00000000 00000000 00000000 00000001
		
		//00000000 00000000 00000000 00000001 = >00000000 本质 1 / 2 / 2 = 0
		
		int c = 1 << 2;
		//1 = > 00000001 = > 00000010 本质 1 * 2  *2 = 4
		
		System.out.println(1 >> 2);//0
		System.out.println(1 << 2);//4
		System.out.println(1>>>8);
		
		
	}
}