import java.lang.StringBuilder;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Excercise14_5{
  public static void main(String[] args){

    List<String> articles = Arrays.asList( "the", "a", "one", "some", "any" );
    List<String> nouns = Arrays.asList( "boy", "girl", "dog", "town", "car" );
    List<String> verbs = Arrays.asList( "drove", "jumped", "ran", "walked", "skipped" );
    List<String> preps = Arrays.asList( "to", "from", "over", "under", "on" );

    for(int i = 0; i < 19; i++){
      String sentence = ListToString(articles, nouns, verbs, preps);
      System.out.println(sentence);
    }
  }
  private static String ListToString(List<String> art, List<String> noun, List<String> verb, List<String> prep){
    StringBuilder str = new StringBuilder();

    Random rand = new Random();
    int rand_article = rand.nextInt(5);
    int rand_noun = rand.nextInt(5);
    int rand_verb = rand.nextInt(5);
    int rand_prep = rand.nextInt(5);

    str.append(art.get(rand_article)).append(" "); //first word plus space
    str.append(noun.get(rand_noun)).append(" ").append(verb.get(rand_verb)).append(" ");
    str.append(prep.get(rand_prep)).append(" ");
    //reroll random number for article as to reduce possibility of reuse
    rand_article = rand.nextInt(5);
    rand_noun = rand.nextInt(5);
    str.append(art.get(rand_article)).append(" ").append(noun.get(rand_noun)).append(".");

    //str = toUpperCase(str[0]);

    return str.toString();
  }
}
