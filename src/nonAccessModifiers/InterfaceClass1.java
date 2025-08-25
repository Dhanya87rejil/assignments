package nonAccessModifiers;

public interface InterfaceClass1 {

	abstract void loginchrome();
	void loginappln();
	
	//default method is used to make the method as non-mandatory to implement
	default void close()
	{
		System.out.println("CLose the appln");
		print();
	
	}
	 static void clear()
	{
		System.out.println("clear the cache");
	
	
	}
	 private void print()
	 {
		 System.out.println("Print all statement 1");
		 System.out.println("Print all statement 2");
	 }
}
