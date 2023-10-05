public class method{
	public static void main(String[]age) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		int returnes = p1.getSum(10, 20);
		System.out.println("get的返回值=" +returnes );
	}
}
    
    class Person {
	String name;
	int age;
    
   public void  speak() {
	System.out.println("我是一个好人");
    }
    public void cal01() {
    	int sum = 0;
    	for(int i = 0; i <= 1000; i++) {
    		sum += i;
    	}
    	System.out.println("计算结果=" + sum);
    }
   public void cal02(int n) {
	   int sum = 0;
	   for(int i = 0; i <= n; i++) {
		   sum += i;
	   }
	   System.out.println(sum);
   }
      public int getSum(int num1,int num2) {
    	  int sum = num1 + num2;
    	  return sum;
      }
       
   
    }