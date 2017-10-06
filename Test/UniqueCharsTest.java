import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharsTest {

  UniqueChars uniqueChars;

  @Before
  public void setUp() throws Exception {
    if (uniqueChars == null) {
      uniqueChars = new UniqueChars();
    }
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void uniqueCharacters() throws Exception {
    assertEquals(Arrays.asList("ngrm"), UniqueChars.uniqueCharacters("anagram"));
  }

  @Test
  public void uniqueCharacters1() throws Exception {
    assertEquals(Arrays.asList("báltszl"), UniqueChars.uniqueCharacters("abáltszalonna"));
  }

  @Test
  public void uniqueCharacters2() throws Exception {
    assertEquals(Arrays.asList("pistike"), UniqueChars.uniqueCharacters(""));
  }

}