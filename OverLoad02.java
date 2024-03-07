public class OverLoad02 {
	public static void main(String[] agrs) {
		 Methods M2 = new Methods();
		double i1 =  M2.m(2, 3);
		double i2 = M2.m(2.2, 3.3);
		double i3 =M2.m(1, 10.25, 12);
		System.out.println("第一个方法结果 = " + i1);
        System.out.println("第二个方法结果 = " + i2);
        System.out.println("第三个方法结果 = " + i3);
	}
}


class Methods {
	public double m (int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
		public double m(double n1, double n2) {
			return n1 > n2 ? n1 : n2;
		}
		
		public double m(double n1, double n2, double n3) {
	        double max1 = n1  > n2 ? n1 : n2;
	        return max1 > n3 ? max1 : n3;
		}
		
	}