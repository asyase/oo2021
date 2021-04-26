package HW9;

import java.util.*;
import java.io.*;
import java.util.List;

	
public class StreamToEmailConverter {
	
public static void main(String[] arg) throws Exception{
		PrintWriter pw = new PrintWriter( new FileWriter("names_converted.txt"));
		List<String> list = Arrays.asList("Maria Rebane", "Paul Kiik", "Olesya Talts", "Igor B", "Amelia Mihhailova", "Jan Mets", "Olesya Talts", "Igor B");
		list
		.stream()
		.map(String::toLowerCase)
		.map(entry -> entry.replaceAll(" ", "."))
		.map(entry -> entry + "@tlu.ee ")
		.sorted()
		.distinct()
		.peek(System.out::println)
		.forEach(pw::println);
		
		
		
		pw.close();

		
		
	}
	
}
