package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "string={0}, happy={1}")
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false","gg,true",",false","gxg,false","ggx,true","xgg,true","g,false","xxx,false"})
    public void testAlgorithm(String string, boolean expectedResult){
        boolean result = new GHappy().gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
