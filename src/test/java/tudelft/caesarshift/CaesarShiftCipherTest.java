package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({"abc,3,def","xyz,3,abc","x,1,y","ab,26,ab","abc,0,abc","aaa,3,ddd","aaa,-1,zzz",",1,","forest,3,iruhvw"})
    public void testAlgorithm(String message, int shift, String expectedResult){
        String result = new CaesarShiftCipher().CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
