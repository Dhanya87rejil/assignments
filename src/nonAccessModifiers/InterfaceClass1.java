package nonAccessModifiers;

public interface InterfaceClass1 {

	//abstract methods in interfaces
	abstract void loginchrome();
	void loginappln();
	
	//default method is used to make the method as non-mandatory to implement
	default void close()
	{
		System.out.println("CLose the appln");
		print();
	
	}
	
	//we can access static method of interface from another normal class because static methods can be used only in static memory i.e method area
	 static void clear()
	{
		System.out.println("clear the cache");
	
	
	}
	 // we allow normal method with private access within interface to avoid duplicate codes in default methods
	 private void print()
	 {
		 System.out.println("Print all statement 1");
		 System.out.println("Print all statement 2");
	 }
}
