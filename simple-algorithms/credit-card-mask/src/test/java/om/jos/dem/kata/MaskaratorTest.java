package om.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jos.dem.kata.Maskarator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
