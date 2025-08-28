package nonAccessModifiers;

public   class Finalclass1 {
	 String empname = "Dhanya";
	 
	 Finalclass1(int a)
	 {
		
		 System.out.println(a);
	 }

	public  void printname(String newname)
	{
		empname = newname;
	System.out.println("This is class 1:" +empname);
	}
	
	public void method2()
	{
		System.out.println("This is method 2 from class 1");
	}
	public static void main(String[] args) {

		Finalclass1 obj =  new Finalclass1(2);
		obj.printname("Adhyuth");
	}
}
