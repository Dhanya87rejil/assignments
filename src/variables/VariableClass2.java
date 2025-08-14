package variables;

public class VariableClass2 {
	
	String topic2 = "Selenium"; //instance variable
	static String topic3 = "API"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String topic1 = "Java";//local variable
		System.out.println("Topic 1:" +topic1);
		
		VariableClass2 obj = new VariableClass2();
		System.out.println("Topic 2:" +obj.topic2);
		System.out.println("Topic 3:" +topic3);
		
		

	}

}
