package om.josdem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.josdem.kata.Maskarator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */

class MaskaratorTest {

  private Maskarator maskarator = new Maskarator();

  @Test
  @DisplayName("Not maskify short strings")
  void shouldNotMaskifyShortStrings() {
    assertEquals("1", maskarator.maskify("1"));
    assertEquals("", maskarator.maskify(""));
  }

  @Test
  @DisplayName("Maskify strings")
  void shouldMaskifyString() {
    assertEquals("############5616", maskarator.maskify("4556364607935616"));
    assertEquals("#######5616", maskarator.maskify("64607935616"));
  }

  @Test
  @DisplayName("Maskify special strings")
  void shouldMaskifySpecialStrings() {
    assertEquals("##ippy", maskarator.maskify("Skippy"));
    assertEquals(
        "####################################man!",
        maskarator.maskify("Nananananananananananananananana Batman!"));
  }
}
