import org.junit.*;
import static org.junit.Assert.*;


public class LetterReplaceTest {

  @Test
  public void willReplaceLetter_aWithADash_aBecomesDash() {
    LetterReplace replaceLetter = new LetterReplace();
    assertEquals("-", replaceLetter.willReplaceLetter("a"));
  }

  @Test
  public void willReplaceLetter_allVowelsInWord_vowelsBecomeDashes() {
    LetterReplace replaceLetter = new LetterReplace();
    assertEquals("d-skt-p", replaceLetter.willReplaceLetter("desktop"));
  }
}
