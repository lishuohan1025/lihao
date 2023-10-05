public class TwoDimensionaArray02 {
	public static void main(String[] args) {
		
		int[][]arr = new int[10][];//创建二维数组但是一维元素是空的
		for(int i = 0; i < arr.length; i++) {//遍历arr每个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组new 那么一维数组是空的 
			arr[i] = new int[i + 1];
			//遍历一维数组，并给一维数组的每个元素赋值
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = i + 1;
			}
			
		}
		for( int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
}
	