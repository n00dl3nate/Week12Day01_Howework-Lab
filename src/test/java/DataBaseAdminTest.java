import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Simon","JZ665773B",26000);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",dataBaseAdmin.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JZ665773B",dataBaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary(){
        double result = dataBaseAdmin.getSalary();
        assertEquals(26000.00,result,.01);
    }

    @Test
    public void raise(){
        dataBaseAdmin.raiseSalary(2000.00);
        assertEquals(28000.00,dataBaseAdmin.getSalary(),0.01);
    }

    @Test
    public void bonus(){
        assertEquals(260.00,dataBaseAdmin.bonus(),0.01);
    }
}
