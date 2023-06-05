import java.util.Scanner;
public class Switch01 {
	
	public static void main(String[] args) {
    //思路分析
		//使用swith 来完成匹配
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-g）");
		char c1 = myScanner.next().charAt(0);//在java中只要是有zhi返回就是一个表达式
		
		switch(c1) {
		case 'a' :
			System.out.println("今天星期一 猴子穿新衣");
			break;
		case 'b' :
			System.out.println("今天星期二 猴子当小二");
			break;
		case 'c' :
			System.out.println("今天星期三 猴子当小三");
			break;
			//....
			default:
				System.out.println("你输入的字符不正确，没有匹配的");
				
				
				System.out.println("退出了swich01.java");		
		}
	}
	
}