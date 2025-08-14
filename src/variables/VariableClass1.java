package variables;

public class VariableClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableClass2 obj = new VariableClass2();

		System.out.println("Topic 2:" +obj.topic2);//Instance variable called from different class
		System.out.println("Topic 3:" +VariableClass2.topic3); //Static variable called from different class
	}

}
