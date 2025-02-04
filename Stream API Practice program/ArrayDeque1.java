package stream_jan31.stream_api_mcqs;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
	    // Create an ArrayDeque of strings
	    ArrayDeque<String> de = new ArrayDeque<String>();
	    de.push("well !!");  // Push "well !!" onto the deque
	    de.push("prepare");  // Push "prepare" onto the deque

	    // Print a message to the console
	    System.out.println("Hi Everyone All The Best!!!");

	    // Iterate through the elements of the deque and print each element
	    for (Object element : de) {
	        System.out.println(element);
	    }

	    // Expected output:
	    // Hi Everyone All The Best!!!
	    // prepare
	    // well !!
	}

}
