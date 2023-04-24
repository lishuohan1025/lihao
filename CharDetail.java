public class CharDetail {
	//编写一个main方法
	public static void main(String[]args) {
		//在java中char是一个整数，在输出时，是unicode码对应的字符
		char A1 =100;
		System.out.println(A1);//d
		
		char A2 = 'L';//输出L对应的数字
		System.out.println((int)A2);
		char A3 = '李';
		System.out.println((int)A3);//26446
		char A4 = 26446;
		System.out.println(A4);
				
		
		
	}
}