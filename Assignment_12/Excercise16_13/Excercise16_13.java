import java.util.Scanner;
import java.lang.Character;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

//I'm going to reuse code for efficiency-sake, I hope that is okay!
//Basing this off the previous excercise(ex 16.13)

public class Excercise16_13{
  public static void main(String[] args){
    Map<String, Integer> myMap = new HashMap<>();

    createMap(myMap);
    displayMap(myMap);
  }

  private static void createMap(Map<String, Integer> map) {
     Scanner scanner = new Scanner(System.in); // create scanner
     System.out.println("Enter a string:"); // prompt for user input
     String input = scanner.nextLine();


     // tokenize the input
     String[] tokens = input.split(" ");
     // processing input text
     for (String token : tokens) {
        String chars = token.toLowerCase(); // get lowercase word

        // if the map contains the word
        if (map.containsKey(chars)) { // is word in map?
           int count = map.get(chars); // get current count
           map.put(chars, count + 1); // increment count
        }
        else {
           map.put(chars, 1); // add new word with a count of 1 to map
        }
     }
  }

  private static void displayMap(Map<String, Integer> map) {
     Set<String> keys = map.keySet(); // get keys

     // sort keys
     TreeSet<String> sortedKeys = new TreeSet<>(keys);

     System.out.printf("%nMap contains:%nKey\t\tValue%n");


     // generate output for each key in map
     for (String key : sortedKeys) {
       if(map.get(key) > 1)
        System.out.printf("%-10s%10s%n", key, map.get(key));
     }

     System.out.printf(
        "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
  }
}
