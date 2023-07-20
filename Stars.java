public class Stars {
	public static void main(String[]agrs) {
		
		//思路分析
		//化繁为简
		//1. 先打印一个矩形
		
		//2.打印半个金字塔
		//第一层有一个*
		//第二层有两个**
		//第三层有3个**
		//第四层有4个*
		//第五层有5个*
		//3.打印整个金字塔
		
		
		int totalLevel = 10;
		for(int i = 1; i <= totalLevel; i++) {//i表示层数
			//输出*之前还要输出空格
			for(int k = 1; k <= totalLevel-i; k++) {
				System.out.print(" ");
			}
			//控制打印每层的*的格数
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
				
			//每打完一层的*就应该换行
			System.out.println("");
		}
	}
}
