import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LetterReplace {
  public static void main(String[] args) {

  }

  public static String willReplaceLetter(String word) {

    String changedWord = "";
    char[] splitWord = word.toCharArray();

      for(Integer index = 0; index < splitWord.length; index++) {

        if(splitWord[index] == 'a') {
          changedWord += '-';
        } else if(splitWord[index] == 'e') {
          changedWord += '-';
        } else if(splitWord[index] == 'e') {
          changedWord += '-';
        } else if(splitWord[index] == 'i') {
          changedWord += '-';
        } else if(splitWord[index] == 'o') {
          changedWord += '-';
        } else if(splitWord[index] == 'u') {
          changedWord += '-';
        } else {
          changedWord += splitWord[index];
        }
      } return changedWord;

  }
}
