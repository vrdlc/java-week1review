import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LetterReplace {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String inputWord = request.queryParams("inputWord");
      String results = willReplaceLetter(inputWord);
      model.put("results", results);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

  }

  public static String willReplaceLetter(String word) {

    String changedWord = "";
    char[] splitWord = word.toCharArray();

      for(Integer index = 0; index < splitWord.length; index++) {

        if(splitWord[index] == 'a' || splitWord[index] == 'A') {
          changedWord += '-';
        } else if(splitWord[index] == 'e' || splitWord[index] == 'A') {
          changedWord += '-';
        } else if(splitWord[index] == 'e' || splitWord[index] == 'E') {
          changedWord += '-';
        } else if(splitWord[index] == 'i' || splitWord[index] == 'I') {
          changedWord += '-';
        } else if(splitWord[index] == 'o' || splitWord[index] == 'O') {
          changedWord += '-';
        } else if(splitWord[index] == 'u' || splitWord[index] == 'U') {
          changedWord += '-';
        } else {
          changedWord += splitWord[index];
        }
      } return changedWord;

  }
}
