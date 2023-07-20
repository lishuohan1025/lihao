import java.util.Scanner;//表示表示把java .util下的Scanner类导入
public class BreakDetail02 {
	
	public static void main(String[]agrs) {
		//实现登陆验证，有3次机会，如果用户名为”李好“ 密码666 提示登陆成功 ，否则提示还有几次机会，请使用for + break完成
		//1 实现登陆验证
		//2 有3 次机会
		//3 如果用户名为t
		//4 否侧  
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
		    System.out.println("请输入密码");
			passwd = myScanner.next();
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你 登陆成功！");
				break;
				
			}
			chance --;
			System.out.println("你还有"+chance+"次登陆机会");
		}
		
	}
}