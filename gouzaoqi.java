public class gouzaoqi {
	public static void main(String[] agrs) {
		 Person p1 = new Person();
		 System.out.println("p1.name=" + p1.name + "p1.age=" + p1.age);
		 Person p2 = new Person();
		 dog dog1 = new dog();
		//第一个无参构造器
		 //利用构造器设置所有人的age属性都为18
		 //第二个带Pname和Page两个参数的构造器
		 //使得每次创建Person对象的同时初始化对象的age属性和name属性，
		 //分别使用不同的构造器创建对象
		}
}

class dog {
	
	
		
	
	
	
	
}
class Person {
	String name;
	int age;
	public Person() {
		
		
		age = 18;
		
		
	}
	public Person(String pname ,int pAge) {
		name = pname;
		age = pAge;
	}
}