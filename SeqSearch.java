import java.util.Scanner;//表示表示把java .util下的Scanner类导入

public class SeqSearch {
	
	public static void main(String[] args) {
		
		 
		String[] names = { "白眉鹰王","金毛狮王", "轻翼蝠王", "紫衫龙王"};
	Scanner  myScanner = new Scanner(System.in);
	
	  System.out.println("请输入名字");
	   String findName =  myScanner.next();
	   //遍历数组，逐一比较，如果有，则提示信息，并退出
	   int index = -1;
	   for(int i = 0; i < names.length; i ++ ){
		   if( findName.equals(names[i])) {
			   
			   
			   System.out.println("恭喜你找到"+ findName);
			   System.out.println("下标为"+ i);
			   //把i保存到 index
			   index = i;
			   break;//提前退出
			   
		   }
	   }
	   if(index == -1) { // 没有找到
		   System.out.println("sorry 没有找到");
	   }
	}
}
	
	