import java.util.Scanner;//表示表示把java .util下的Scanner类导入
public class If03 {
	
	public static void main(String[] args) {
		
		//如果：
		//1 信用分为100分时，输出信用极好；
		//2 信用分为（80.99）时，输出信用优秀；
		//3，信用分为（60，80） 时，输出信用一般；
		//4 其他情况 输出信用不及格
		//5 请从键盘输入李好的芝麻信用分，并加以判断
		
		//假定信用分为int
		Scanner myScanner = new Scanner(System.in);
		//接受用户输入
		System.out.println("请输入信用分");
		int grade = myScanner.nextInt();
		
		//因为有4种情况，所以使用多分支
		
		if(grade >= 1000) {
			System.out.println("信用极好");
		} else if(grade > 80 && grade <= 99) { //信用分为（80.99）时，输出信用优秀
		
		    System.out.println("信用优秀");
	    } else if (grade >= 60 && grade <= 80) {
	    	System.out.println("xinyong一般");
	    } else {
	    	System.out.println("信用不及格");
	    	
		
	}
}
}
