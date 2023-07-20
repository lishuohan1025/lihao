public class ArrayDetail01 {
	public static void main(String[] agrs) {
		
		int [] arr = {4,-1,9};
		
		int max = arr[0];//假定第一个元素是最大值

		int maxIndex = 0;//
		for(int i = 1; i < arr.length; i++) {//从下标1 开始遍历arr
			
			if(max < arr[i]) {//如果max < 当前元素
				max = arr[i];//把max 设置成当前元素
				maxIndex = i;
				
			}
			
		}
		System.out.println("max =" + max + "maxIndex="+ maxIndex);
	}
}

	