package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment15_StringOperations {

	public static void main(String[] args) {
	//1.Count the total number of words in the sentence.
		String scentence = "Java programming is fun and challenging";
		System.out.println("Total number of characters in the scentence: " +scentence.length());
		String words[] = scentence.split(" ");
		System.out.println("Total number of words in the sentence: "+words.length);
		
	//2. Print the sentence words in reverse order.
		String reverseScentence = "";
		for (int i = scentence.length()-1; i>=0; i--)
		{
			reverseScentence = reverseScentence + scentence.charAt(i);
		}
		System.out.println("The reverse of the scentence is: " +reverseScentence);
		
	//3. Convert the first character of each word to uppercase and print original sentence

		String finalWord[] = new String[words.length];
	for(int i =0;i<=words.length-1;i++)
	{
		String word= words[i];
		String firstLetter = word.substring(0, 1).toUpperCase();
		String remainingLetter= word.substring(1);
		finalWord[i]=firstLetter+remainingLetter;
		System.out.print(finalWord[i]+ " ");
	}

}
}