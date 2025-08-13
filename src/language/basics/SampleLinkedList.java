package language.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> empnamelinkedlist = new LinkedList <String> ();
		empnamelinkedlist.add("Dhanya");
		empnamelinkedlist.add("Dhanya");//duplicate
		empnamelinkedlist.add("Rejildas");
		empnamelinkedlist.add("Niyathi");
		empnamelinkedlist.add("Adhyuth");
		empnamelinkedlist.remove(1);
		empnamelinkedlist.size();

		empnamelinkedlist.get(2);

		System.out.println(empnamelinkedlist.get(3));
		System.out.println(empnamelinkedlist.size());
		
	
	}

}
