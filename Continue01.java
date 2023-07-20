public class Continue01 {
	public static void main(String[]agrs) {
		
		//int i = 1;
		//while (i <= 4) {
			//i++;
		//	if (i == 2) {
				//continue;
				
			//}
			//System.out.println("i = " + i);
		//}
		
		label1:
			for(int j = 0; j < 2; j++) {
				labe12 :
				for(int i = 0; i < 10; i++) {
					if(i == 2) {
						continue label1;
					}
					System.out.println("i =" + i);
				}
			}
	}
}
	
	