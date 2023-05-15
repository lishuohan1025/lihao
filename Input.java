import java.util.Scanner;//表示表示把java .util下的Scanner类导入
public class Input {
	public static void main(String[] agrs) {
		//演shi接受用户的输入
		//步骤
		//Scanner类 表示 简单的文本扫描器，在java.util 包
		//1. 引入 Scanner类所在的包
		//2. 创建 Scanner 对象
		
		
		Scanner myscanner = new Scanner(System.in);
		//3. 接受用户的输入了
		System.out.println("请输入名字");
		String name = myscanner.next();//接受用户输入字符串
		System.out.println("请输入年龄");
	    int age  = myscanner.nextInt();//接受用户输入int
	    System.out.println("请输入薪水");
		double sal = myscanner.nextDouble();//接受用户输入double
		System.out.println("人的信息如下：");
		System.out.println("名字" + name + " 年龄= " + age + " 薪水=" + sal);
		
		
	}
	
}