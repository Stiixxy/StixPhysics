package Physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class mainClassTest{

    @Test
    @DisplayName("Main test")
    public void mainTest(){
        assertEquals(true,true);

        System.out.println();

        mainClass main = new mainClass();
        assertEquals(5, main.mainClassFunction());
    }

}