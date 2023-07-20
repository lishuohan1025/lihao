public class MulForExercise02 {
	public static void main(String[]agrs) {
		//打印出九九乘法表
		//思路分析：
		//化繁为简
		//先计算99乘法表的最大值是多少
		int num = 9;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
		
				int  result = i * j;
				System.out.println(i + "*"  + j + "=" + result );
			}
			System.out.println();
		}
		
        }
	}
