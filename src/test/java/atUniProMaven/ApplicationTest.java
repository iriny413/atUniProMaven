package atUniProMaven;

import static org.junit.Assert.*;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void  sayHello(){
        Application application = new Application();
        String message = application.sayHello();

        assertEquals("Hello JUnit!", message);
    }

    @Test
    public void powerTwoInTwoTest(){
        Application application = new Application();
        int result = application.power(2,2);

        assertEquals(9,result);
    }

}