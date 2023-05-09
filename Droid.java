public class Droid {
	
	String name;
	
	int batteryLevel;
	
	public Droid(String droidname) {
		
	
		name = droidname;
		
		batteryLevel = 100;
			
		}
		
		public void performTask(String task) {
			batteryLevel = batteryLevel - 10;
			System.out.println(name + " is perform task : " + task );
		}
		
		
		
		public String toString() {
			return " 你好 我是机器人 droid" + name;
			
			
		}
		
	
		
	public static void main(String[]agrs) {
		
		Droid codey = new Droid("Codey");
		System.out.println(codey);
		codey.performTask("dancing");
		codey.performTask("coding");
		
		

		
		
	}
}