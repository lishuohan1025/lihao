public class ArrayDetail {
	public static void main(String[] agrs) {
		
		//创建一个char类型的26个元素的数组，分别防止A-Z
		//使用for循环把所有元素并打印出来
		char[] chars = new char[26];//26个数组
		
		for(int i = 0; i < chars.length; i++) {//循环26次
			chars[i] =(char) ('A' + i);
		}
		System.out.println("===char类型数组====");
	for(int i = 0; i <chars.length; i++) {
		System.out.println(chars[i]);
	}
	}
}
	