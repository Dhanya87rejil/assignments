package assignments;


public class Assignment16_SearchOccurance {

	// search for all occurrences of a “Java” word in the paragraph and print their indexes.
	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String word = "Java";
String ParaArray[] = paragraph.split(" ");
System.out.println("The Number of words in the scenatence is :" +ParaArray.length);
int count = 0;

for (int i = 0; i < ParaArray.length-1; i++)
{
   
        if ((ParaArray[i].equals("Java")))
        {
        	count++;
        }

}    
 
System.out.println("The total occurrences of a Java  word is: " + count);
int index = paragraph.indexOf(word);
//  If the string is not found, it returns -1 and the loop stops
while (index != -1) {
    System.out.println("'Java' found at index: " + index);
    //String.indexOf(String str, int fromIndex)It searches for the next occurrence of word starting from position index + word.length().
 index = paragraph.indexOf(word, index + word.length());
}

}
	}

