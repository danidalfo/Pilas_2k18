import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Stack;




public class StackImplTest {

   Stack<String> stack;

    @BeforeAll
    public void declareStack()
    {
        stack = new Stack<String>();
    }


    @BeforeEach
    public void setUp()
    {
        stack.push("1");
    }



    @Test
    public void testSize()
    {
        assertEquals(1,stack.size());
    }


    @Test
    public void testPush()
    {
        stack.push("2");

        assertEquals(2,stack.size());
    }


    @Test
    public void testPop()
    {
        stack.pop();

        assertNotEquals(1,stack.size());
    }

    @Test(expected = PilaBuida.class)
    public void testEmptyStack()
    {
        stack.pop();
        stack.pop();
    }

    @Test(expected = PilaPlena.class)
    public void testFullStack()
    {
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        //Depén del límit del stack, potser cal ficar més push
    }

}
