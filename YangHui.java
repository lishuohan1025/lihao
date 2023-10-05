public class YangHui {
	public static void main(String[] args) {
		//1 1 
		//1 2 1 
		//1 3 3 1 
		//1 4 6 4 1 
		//1 5 10 10 5 1 
		
		//。。。
		//1， 第一行有一个元素，第n行有n个元素。
		//2， 每一行的第一个元素和最后一个元素都是1；
		//3， 从第三行开始，对于非第一个元素和最后一个元素的值arr[i][j]
		//arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		int [][] yanghui = new int[10][];//创建二维数组
		
		for(int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
			//给每个一维数组（行）赋值
			for(int j = 0; j < yanghui[i].length; j++) {
				if(j == 0 || j == yanghui[i].length - 1) {
					yanghui[i][j] = 1;
				}else {
					yanghui[i][j] = yanghui[i -1][j] + yanghui[i - 1][j-1];
				}
			}
			
		}
			for(int i = 0 ; i < yanghui.length; i++) {
				for(int j = 0; j < yanghui[i].length; j++) {
					System.out.print(yanghui[i][j] + " ");
				}
				System.out.println("");
			}
			
	}
}
