import java.util.Scanner;
public class Array01 {
	public static void main(String[] agrs) {
		
		//
		//double [] scores = new double [5];
		double scores[];
		scores = new double[5];
		// 循环
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第"+ (i+1)+"个元素的值");
			scores [i] = myScanner.nextDouble();
							
			}
		System.out.println("== 数组的元素/ 值的情况如下：===");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第"+(i+1)+ "个元素的值=" + scores[i]);
				
		}
	}
}