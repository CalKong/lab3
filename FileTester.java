import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class FileTester {

    @Test
    public void testGetFilesInDirectory() {

        File directory = new File("some-files");
        try {
            List<File> files = FileExample.getFiles(directory);

            assertEquals(5, files.size()); // Expecting 5 files in the directory and subdirectories
            assertTrue(files.contains(new File("some-files/a.txt")));
            assertTrue(files.contains(new File("some-files/more-files/b.txt")));
            assertTrue(files.contains(new File("some-files/more-files/c.java")));
            assertTrue(files.contains(new File("some-files/even-more-files/d.java")));
            assertTrue(files.contains(new File("some-files/even-more-files/a.txt")));
        } catch (IOException e) {
            fail("IOException should not be thrown in this case.");
        }
    }

    @Test
    public void testGetFilesInSubdirectory() {
        File directory = new File("some-files/more-files");
        try {
            List<File> files = FileExample.getFiles(directory);

            assertEquals(2, files.size()); // Expecting 2 files in the subdirectory
            assertTrue(files.contains(new File("some-files/more-files/b.txt")));
            assertTrue(files.contains(new File("some-files/more-files/c.java")));
        } catch (IOException e) {
            fail("IOException should not be thrown in this case.");
        }
    }

    @Test
    public void testGetFilesInSingleFile() {
        File singleFile = new File("some-files/a.txt");
        try {
            List<File> files = FileExample.getFiles(singleFile);

            assertEquals(1, files.size()); // Expecting 1 file for a single file input
            assertTrue(files.contains(new File("some-files/a.txt")));
        } catch (IOException e) {
            fail("IOException should not be thrown in this case.");
        }
    }
    

}