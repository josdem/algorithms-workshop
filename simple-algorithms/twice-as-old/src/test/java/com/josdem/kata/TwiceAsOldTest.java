package com.josdem.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given dad and son years old
 * When I call compute method
 * Then I will get how many years ago the father was twice as old as his son
 */

class TwiceAsOldTest {

  private TwiceAsOld twiceAsOld = new TwiceAsOld();

  private static final Logger log = Logger.getLogger(TwiceAsOldTest.class.getName());

  @Test
  @DisplayName("validate twice as old")
  void shouldValidateTwiceAsOld(TestInfo testInfo) {
    log.info("Running: " + testInfo.getDisplayName());
    assertEquals(30, twiceAsOld.compute(30, 0));
    assertEquals(16, twiceAsOld.compute(30, 7));
    assertEquals(15, twiceAsOld.compute(45, 30));
  }
}
