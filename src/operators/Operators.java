package operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//arithmatic
		System.out.println("===========Arithmatic Operators:=============");
		int a = 20;
		int b = 10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(++a);//pre increment
		System.out.println(a++);//post increment
		System.out.println(a);
		System.out.println(--b);//pre decrement
		System.out.println(b--);//post decrement
		System.out.println(b);
		
		//2. Assignment Operators ==> Special characters used to assign values to variables.
		System.out.println("===========Assignment Operators:=============");
		// = ==> Assignment
		// += ==> Add and assign
		// -= ==> Subtract and assign
		// *= ==> Multiply and assign
		// /= ==> Divide and assign
		// %= ==> Modulus and assign
		
		//3. Comparison Operators ==> Special characters used to compare two primitive datatypes.
		System.out.println("===========Comparison Operators:=============");
		// == ==> Equal to
		// != ==> Not equal to
		// > ==> Greater than
		// < ==> Less than
		// >= ==> Greater than or equal to
		// <= ==> Less than or equal to
		//4. Logical Operators ==> Special characters used to perform logical operations.
		System.out.println("===========Logical Operators:=============");
		// && ==> Logical AND  ==> Returns true only if all conditions are true
		// || ==> Logical OR ==> Returns true if at least one condition is true
		// ! ==> Logical NOT ==> Reverses the logical state of its operand

		//5. Ternary Operator ==> Special character used to perform conditional operations.
		System.out.println("===========Ternary Operator:=============");
		// ? : ==> Ternary operator (conditional operator)
		// Syntax: condition ? value_if_true : value_if_false
	}

}
