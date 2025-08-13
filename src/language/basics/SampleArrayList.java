package language.basics;

import java.util.ArrayList;
import java.util.List;

public class SampleArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> empnamearraylist = new ArrayList <String> ();
empnamearraylist.add("Dhanya");
empnamearraylist.add("Dhanya");//duplicate
empnamearraylist.add("Rejildas");
empnamearraylist.add("Niyathi");
empnamearraylist.add("Adhyuth");
empnamearraylist.remove(1);
empnamearraylist.size();

empnamearraylist.get(2);

System.out.println(empnamearraylist.get(2));
System.out.println(empnamearraylist.size());
	}

}
