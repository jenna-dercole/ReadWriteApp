
package readwriteapp;

import java.io.File;

/**
 *
 * @author Jenna
 */
public class ReadWriteApp {

   
    public static void main(String[] args) {
        FileService fileservice = new FileService();
        File file = new File(fileservice.getFilePath());
        FileReaderStrategy frs = new TextReader(fileservice.getFilePath());
        frs.readFile();
    }
    
}
