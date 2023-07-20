import java.util.Scanner;
public class DoWhile02 {
	public static void main(String[]args) {
		//int sum = 0;
		//int i = 1;
		//do {
			//sum += i;
			//i++;
			
			//System.out.println("1到100的合为=" + sum);
			//}while(i <= 100);
		//统计1到200之间能被5整除不能被3乘除的个数
		//int nmb = 1;
		//int count = 0;
		//do {
			//if(nmb % 5 == 0 && nmb % 3 != 0) {
			//	System.out.println("i=" + nmb);
			//	count++;
			//}
			//nmb++;
			
		//}while(nmb <= 200);
		//System.out.println("count= " + count);
		  Scanner myScanner= new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("老李使用出无连bian");
			System.out.println("老李问：还钱没？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'y');
	}
}
		