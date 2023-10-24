import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class ListTests {

    @Test
    public void testFilter(){

        ArrayList<String> input = new ArrayList<>();
        input.add("1");
        input.add("2");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");

        assertEquals(expected, ListExamples.filter(input, new SC()));

    }

    @Test
    public void testMerge(){
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input1.add("d");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("c");
        input2.add("e");
        input2.add("f");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        expected.add("f");

        assertEquals(expected, ListExamples.merge(input1, input2));
    }

}