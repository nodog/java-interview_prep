package StringAddition;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringAdditionTest {
    StringAddition sa;

    @Before
    public void init() {
    }

    @Test
    public void shouldReturnZeroForZeros() {
        assertEquals("0", StringAddition.add("0", "0"));
    }

    @Test
    public void shouldReturnTwoForOnes() {
        assertEquals("2", StringAddition.add("1", "1"));
    }

    @Test
    public void shouldReturn22For11s() {
        assertEquals("22", StringAddition.add("11", "11"));
    }

    @Test
    public void shouldReturn32For16s() {
        assertEquals("32", StringAddition.add("16", "16"));
    }

    @Test
    public void shouldReturn122For61s() {
        assertEquals("122", StringAddition.add("61", "61"));
    }

    @Test
    public void shouldReturn132For66s() {
        assertEquals("132", StringAddition.add("66", "66"));
    }

    @Test
    public void shouldReturn198For99s() {
        assertEquals("198", StringAddition.add("99", "99"));
    }

    @Test
    public void shouldReturn18For10And8() {
        assertEquals("18", StringAddition.add("10", "8"));
    }

    @Test
    public void shouldReturn18For8And10() {
        assertEquals("18", StringAddition.add("8", "10"));
    }

    @Test
    public void shouldReturn9885or9876And9() {
        assertEquals("9885", StringAddition.add("9876", "9"));
    }

    @Test
    public void shouldReturn988641975For987654321And987654() {
        assertEquals("988641975", StringAddition.add("987654321", "987654"));
    }

    @Test
    public void shouldReturn9999999999For9876543210And123456789() {
        assertEquals("9999999999", StringAddition.add("9876543210", "123456789"));
    }

    @Test
    public void shouldReturn11111111100For9876543210And1234567890() {
        assertEquals("11111111100", StringAddition.add("9876543210", "1234567890"));
    }

    @Test
    public void shouldReturn900000008For900000000And8() {
        assertEquals("900000008", StringAddition.add("900000000", "8"));
    }

    public void shouldReturnAdditionOfTwoStringsOfIntegers() {
    }

}