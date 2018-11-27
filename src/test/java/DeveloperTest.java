import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Simon","JZ665773B",26000);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",developer.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JZ665773B",developer.getNiNumber());
    }

    @Test
    public void getSalary(){
        double result = developer.getSalary();
        assertEquals(26000.00,result,.01);
    }

    @Test
    public void raise(){
        developer.raiseSalary(2000.00);
        assertEquals(28000.00,developer.getSalary(),0.01);
    }

    @Test
    public void bonus(){
        assertEquals(260.00,developer.bonus(),0.01);
    }
}
