import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class LinkedListTest{

    @Test
    public void testAppend(){

        LinkedList l = new LinkedList();
        Node n3 = new Node(3, null);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1,n2);
        l.root = n1;

        LinkedList actual = new LinkedList();
        actual.root = new Node(1,null);
        actual.append(2);
        actual.append(3);
        assertEquals(l.toString(), actual.toString());
    }   
}