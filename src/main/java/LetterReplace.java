import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LetterReplace {
  public static void main(String[] args) {

  }

  public static String replaceLetter(String word) {
    String a = word.replace('a', '-');
    return word;
  }
}
