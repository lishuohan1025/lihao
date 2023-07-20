 public class ForExercise {
	 
	public static void main(String[] args) {
		
		//打印1…～100之间所有是9的倍数的整数，统计个数 及总和
		//化繁为简 ： 即将复杂的需求，拆解成简单的需求，逐步完成
		//先死后活：先考虑固定的值 然后转成可以灵活变化的值 
		
		//
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 9 == 0) {
				System.out.println("i= " + i);
				count++;
				sum += i;
			}
			
		}
		System.out.println("count" + count);
		System.out.println("sum" + sum);
} 
	
	
}
            