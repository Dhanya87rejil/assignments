package nonAccessModifiers;

public class AbstractClass2 extends AbstractClass1{

	  public static void main(String[] args)
	  {
		  AbstractClass2 obj = new AbstractClass2();
		  obj.loginchrome();
		  obj.loginappl();
		  obj.close();
	  }
	@Override
	public  void loginchrome() {
	System.out.println("login chrome function implemented in child class");
		
	}
	@Override
	public void loginappl() {
		System.out.println("login appl function implemented in child class");
		
		
	}

}
