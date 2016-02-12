import org.junit.*;
import static org.junit.Assert.*;


public class LetterReplaceTest {

  @Test
  public void willReplaceLetter_aWithADash_aBecomesDash() {
    LetterReplace replaceLetter = new LetterReplace();
    assertEquals("-", replaceLetter.willReplaceLetter("a"));
  }
}
