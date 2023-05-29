import java.util.Scanner;//表示表示把java .util下的Scanner类导入
public class Nestedlf {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入该歌手的成绩");
		
		double score = myScanner.nextDouble();
		if( score > 8.0) {
			System.out.println("请输入性别和成绩");
			   char gender = myScanner.next().charAt(0);
			   if( gender == '男') {
			 System.out.println("进入男子组");
			   } else if(gender == '女') {
				   System.out.println("进入女子组");
			   } else  {
						   System.out.println("你的性别不对，不能参加决赛");   
			   }	
		} else {
			System.out.println("sorry 你挂了");		
		}
	}
}