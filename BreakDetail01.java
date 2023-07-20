public class BreakDetail01 {
	public static void main(String[]agrs) {
		
		//1 - 100的数求和 求出当和第一次大于20的当前数 （for + barak）
		//思路分析
		//1 循环1到100。 求和
		
		//当sum 大于20的时候记录当前数 然后break；
		int sum = 0;
		int n = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
			if(sum > 20) {
				System.out.println("合第一次>20的时候=" + i);
				n = i;
				break;
				
			}
			//System.out.println("sum="+ i);
		}
		System.out.println("sum="+ n);
	}
}