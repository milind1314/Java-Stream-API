package stream_feb04.count_vowel;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountVowel {

    // Method to count the number of vowels in a given string
    public static int checkVowel(String s) {
        return (int) s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
    }

    public static void main(String[] args) {
        
        // Creating a list of strings
        List<String> strings = List.of("hello", "world", "java", "stream", "api");
        
        // Using streams to map each string to its vowel count
        Map<String, Integer> collect = strings.stream()
            .collect(Collectors.toMap(Function.identity(), CountVowel::checkVowel));
        
        // Printing the resulting map of string to vowel count
        System.out.println(collect);
    }
}
