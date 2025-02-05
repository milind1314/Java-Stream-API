package stream_feb04.count_vowel;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountVowel {

	public static int checkVowel(String s)
	{
		return (int) s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
	}
	public static void main(String[] args) {

		List<String> strings = List.of("hello", "world", "java", "stream", "api");
		
		Map<String, Integer> collect = strings.stream().collect(Collectors.toMap(Function.identity(), CountVowel::checkVowel));
		System.out.println(collect);
	}

}
