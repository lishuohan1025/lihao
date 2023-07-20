public class Return {
	public static void main(String[]agrs) {
		
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("韩顺平教育" + i);
				return;
			}
			System.out.println("Hello world!");
			
		}
		System.out.println("go on..");
	}
}
