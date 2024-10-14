package tests;

import main.BasicUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class BasicUtilTest {

    @Test
    public void reversingArbitraryStringProducesCorrectResult(){
        Assertions.assertEquals(
                "txet modnar", BasicUtils.reversed("random text")
        );
        Assertions.assertEquals(
                "bd#sa6f3basz;", BasicUtils.reversed(";zsab3f6as#db")
        );
    }

    @Test
    public void reversingNullReturnsNull(){
        Assertions.assertNull(BasicUtils.reversed(null));
    }

    @Test
    public void vowelCountArbitraryStringProducesCorrectResult(){
        Assertions.assertEquals(
                7, BasicUtils.vowelCount("hotel california")
        );
        Assertions.assertEquals(
                5, BasicUtils.vowelCount("alkrtcareloi")
        );
    }

    @Test
    public void vowelCountEmptyStringReturnsZero(){
        Assertions.assertEquals(0, BasicUtils.vowelCount(""));
    }

    @Test
    public void vowelCountOnlyVowelStringProducesCorrectResult(){
        Assertions.assertEquals(
                10, BasicUtils.vowelCount("aoioeaioaa")
        );
    }

    @Test
    public void vowelCountOnlyConsonantStringProducesCorrectResult(){
        Assertions.assertEquals(
                0, BasicUtils.vowelCount("bbppllrr")
        );
    }

    @Test
    public void vowelCountNullReturnsNull(){
        Assertions.assertNull(BasicUtils.vowelCount(null));
    }

    @TestFactory
    Stream<DynamicTest> isVowelVowelTest(){
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");
        Iterator<String> it = vowelList.iterator();
        vowelList.stream().forEach(DynamicTest.dynamicTest())
    }
}
