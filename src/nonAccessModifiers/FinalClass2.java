package nonAccessModifiers;

public class FinalClass2 extends  Finalclass1 {

	FinalClass2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	 // method of parent class can be overridden in child class when inheritance.But inheretance cannot be applied for final classes as overridden is not allowed
	 public void printname(String newname)
	{
		System.out.println("This is class 2 overriden method:"  +newname);
	
	} 
	
	public static void main(String[] args) {

		Finalclass1 obj =  new FinalClass2(20);
		obj.printname("Niyathi");
		obj.method2();
		
	}

}
