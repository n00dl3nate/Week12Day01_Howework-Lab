import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Simon","JZ665773B",36000,"KingOfTheCastle",500000);
    }

    @Test
    public void canGetName(){
        assertEquals("Simon",director.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JZ665773B",director.getNiNumber());
    }

    @Test
    public void canGetDept(){
        assertEquals("KingOfTheCastle",director.getDeptName());
    }

    @Test
    public void getSalary(){
        double result = director.getSalary();
        assertEquals(36000.00,result,.01);
    }

    @Test
    public void raise(){
        director.raiseSalary(2000.00);
        assertEquals(38000.00,director.getSalary(),0.01);
    }

    @Test
    public void bonus(){
        assertEquals(720.00,director.bonus(),0.01);
    }

    @Test
    public void getBudget(){
        assertEquals(500000,director.getBudget(),.01);
    }
}
