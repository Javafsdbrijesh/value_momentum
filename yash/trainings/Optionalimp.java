package trainings;

import java.util.Optional;

public class Optionalimp {
    /*
     * Optional is a container object which may or may not contain a non-null value.
     * Optional class belong to java.util package, it helps in avoiding multiple null checks. Writing neat code.
     * Optionals methods: 
     */
 
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
