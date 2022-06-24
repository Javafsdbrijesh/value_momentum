//Assignment 35: Implement ofNullable() and isPresent() method of Optional.

import java.util.*;
public class Assignment35 {
	public static void main(String[] args) {
		String[] words = new String[10];
		 
        Optional<String> checkNull = Optional.ofNullable(words[5]);
 
        if(checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("word is null");
		}
			
	}
}