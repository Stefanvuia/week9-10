import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileCharReader implements CharReader{
    private Scanner scan;

    /**
     * Initialize this FileCharReader so that it will be reading from a given path.
     * @param path the path of the file to be read
     */
    public FileCharReader(String path) {
        try {
            scan = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            scan = new Scanner(""); // continue with a scanner containing no lines
        }
        scan.useDelimiter("");
    }

    public boolean hasNext() {
        return scan.hasNext();
    }

    public char next() {
        return scan.next().toCharArray()[0];
    }
}
