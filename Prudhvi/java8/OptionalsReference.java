package java8;

import java.util.Optional;



public class OptionalsReference {
//flatmap
//datetime APIs added in java 8
/*
* Optional is a container object which may or may not contain a non-null value.
* Optional class belong to java.util package, it helps in avoiding multiple null checks. Writing neat code.
* Optionals methods:
* 1. empty() - Returns an empty optional instance
* 2. of() - Return an Optional with the specified present non-null value
* 3. ofNullable() - Return an Optional describing the specified value, if non-null, otherwise return an empty optional
*
* we have isPresent(), get().
*/

public static void main(String[] args) {

/*
* String[] words = new String[10]; String word = words[5].toLowerCase();
* System.out.println(word);
*/

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