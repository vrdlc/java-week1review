import org.junit.*;
import static org.junit.Assert.*;


public class LetterReplaceTest {

  @Test
  public void replaceLetter_aWithADash_aBecomesDash() {
    LetterReplace swapLetter = new LetterReplace();
    assertEquals("-", swapLetter.replaceLetter("a"));
  }
}
