import java.util.Arrays;
import java.util.List;

public class UniqueChars {

  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static List<String> uniqueCharacters(String input) {
    String temporal = "";
    for (int i = 1; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (temporal.indexOf(currentChar) < 1) {
        temporal = temporal + currentChar;
      } else {
        temporal = temporal.replace(String.valueOf(currentChar), "");
      }
    }

    return Arrays.asList(temporal + "");
  }

}