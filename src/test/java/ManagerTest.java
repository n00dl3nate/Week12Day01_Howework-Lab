import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Employee employee;
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Simon","JZ665773B",36000,"Sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",manager.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JZ665773B",manager.getNiNumber());
    }

    @Test
    public void canGetDept(){
        assertEquals("Sales",manager.getDeptName());
    }

    @Test
    public void getSalary(){
        double result = manager.getSalary();
        assertEquals(36000.00,result,.01);
    }

    @Test
    public void raise(){
        manager.raiseSalary(2000.00);
        assertEquals(38000.00,manager.getSalary(),0.01);
    }

    @Test
    public void bonus(){
        assertEquals(360.00,manager.bonus(),0.01);
    }


}
