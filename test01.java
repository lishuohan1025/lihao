public class test01 {
	public static void main(String[] args) {
		//实现判断一个整数，属于哪个范围； 
		//大于0 小于0 等于0
		
		//思路定于一个变量
	//使用 if else if else
		//int j = -1;
		//if(j > 0) {
			//System.out.println("大于0");
		//}else if(j < 0) {
		//	System.out.println("小于0");
		//}else { 
		  //   System.out.println("等于0");
		//	}
			//判断一个整数是否是水仙花数	
		//	int n = 123;
		//	int n1 = n/ 100;
		//	int n2 = n%100/  10;
		//	int n3 = n % 10;
				//输出1-100之间不能被5整除的数，每5个一行
		
		//输出1 - 100
		//5个一行
		//思路分析
		//先输出1-100 的数
		//再过滤出不能被5整除的数
		//int count = 0;
		//for(int i = 1; i <= 100; i++) {
			//if(i % 5 != 0 ) {
				//count++;
			//	System.out.println(i + " " );
			//	if(count %5 == 0) {
				//	System.out.println();
			//	}
		//	}
		//}
				
		
		//输出小写的a-z以及大写的a-z
		//for(char c1 = 'a'; c1 <= 'z'; c1 ++) {
			//System.out.println(c1);
		//}
		//求1 + （1+ 2）。。。。（1+2+3+4.。。100）的结果
		int sum = 0;
		for(int i = 1; i <= 100; i++) {//i 可以表示是第几项
			for(int j = 1; j <= i; j++) {
				sum += j;
				
			}
			
		}
		System.out.println("sum =" + sum);
		}
	}

    