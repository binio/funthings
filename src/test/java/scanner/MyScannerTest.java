package scanner;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by thomas on 22/11/17.
 */
public class MyScannerTest {

    MyScanner mysc;

    @Before
    public void setUp() {
        String data = "12.2";
        Scanner scanner;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            scanner = new Scanner(System.in);
        } finally {
            System.setIn(stdin);
        }
        mysc = new MyScanner(scanner);
    }

    //@Test
    public void testOutputString() {
        assertEquals("Hello, World!", mysc.outputString());

    }

    @Test
    public void testOutputInt() {

    }

    @Test
    public void testOutputDouble() {
        assertEquals(new Double(12.2), mysc.outputDouble());
    }

}