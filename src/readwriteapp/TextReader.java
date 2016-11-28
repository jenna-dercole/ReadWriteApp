/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jenna
 */
public class TextReader implements FileReaderStrategy {
    private String filePath;
    private TextFormatStrategy ffs;

    public final TextFormatStrategy getFfs() {
        return ffs;
    }

    public final void setFfs(TextFormatStrategy ffs) {
        this.ffs = ffs;
    }
    
    public TextReader(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void readFile() {
        File data = new File(filePath);
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   } 
        } catch(IOException ioe) {
            System.out.println("Cannot read file!");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
            }
        }
    }
    
}
