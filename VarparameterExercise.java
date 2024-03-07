public class VarparameterExercise {
	public static void main(String[] agrs) {
		
		//有三个方法，
		//分别实现返回姓名和两门课成绩（总分）
		//返回姓名和五门课成绩（总分）
		//封装一个可变参数的方法
		//类名HspMethod
		//方法名showScore
		
		HspMethod m1 = new HspMethod();
		System.out.println(m1.showScore("lihao", 22,39.4));
		
	}
}
class  HspMethod {
	
	public String showScore(String name,double... n1){//姓名和两门课成绩
		double n2 = 0;
		for(int i = 0;i < n1.length; i++) {
			n2 += n1[i];//两门课总成绩
			
		}
		return name +"有"+n1.length+"门课总成绩="+  n2;//返回姓名和成绩
	}
	
					
	
		
	}
	
	