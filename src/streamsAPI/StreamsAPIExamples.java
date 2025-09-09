package streamsAPI;

import java.util.List;

public class StreamsAPIExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(13, 2, 3, 5, 7);
		long multiply = numbers.stream().reduce(1, (a, b) -> a * b);

		System.out.println(multiply);
	}

}
