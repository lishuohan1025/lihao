public class TwoDimensionaArray {
	public static void main(String[] args) {
		
		// 
		int[][] arr = {{0,0,0,0,0,0},
				{0 , 0, 1, 0 , 0, 0},
				{0, 2, 0 ,03,0 ,0},
				{0 ,0 ,0 ,0 ,0,0}};
		System.out.println("二维数组的元素=" + arr.length);
		//二维数组的每个元素是一堆数组，所以如果需要得到每个一维数组的值
		//还需要再次遍历
		System.out.println("第三个一维数组的第四个值=" + arr[2][3]);
		
		for(int i = 0; i < arr.length; i++) {//遍历二维数组
			//得到对应二维数组里的每个一维的长度
			//arr i 表示二维数组的第i个元素
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
		
	}
}
	
	
	
	