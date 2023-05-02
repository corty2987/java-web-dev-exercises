package exercises.technology.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import exercises.technology.Computer;
public class ComputerTest {

    @Test
    public void implementsComputerClass() {
        Computer myComputer = new Computer(5, 6,true);
        assertEquals(5, 6, myComputer.increaseStorage(5));
    }
}
