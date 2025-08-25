package nonAccessModifiers;

public class InterfaceClass2 implements InterfaceClass1 {

	public static void main(String[] args) {

		InterfaceClass2 obj = new InterfaceClass2();
		obj.loginchrome();
		obj.loginappln();
		
		InterfaceClass1.clear();
		obj.close();
		

	}

	@Override
	public void loginchrome() {
		System.out.println("Implemented loginchrome function in class 2");
		
	}

	@Override
	public void loginappln() {
		System.out.println("Implemented loginappln function in Class 2 ");		
	}
	
	@Override
	public void close() {
		System.out.println("Close function is overrridden in class 2");
	}

}
