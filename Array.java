public class Array {
	public static void main(String[] args) {
		
		//
		double [] hens = {3 ,5, 1,3.4 , 2, 50, 50,70,99,99.9};
		System.out.println("使用数组解决");
		//遍历数组的所有元素的和
		double totalWeight = 0;
		
		for(int i = 0; i < hens.length; i++) {
			//System.out.println("第"+ (i+1)+ "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		
			System.out.println("总体重 = "+ totalWeight + "平均体重=" + totalWeight / hens.length);
		}
	}
}
	