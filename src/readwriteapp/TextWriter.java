/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jenna
 */
public class TextWriter implements FileWriterStrategy {
    private String filePath;
    private boolean append = true;
    private TextFormatStrategy tfs;

    public final TextFormatStrategy getTfs() {
        return tfs;
    }

    public final void setTfs(TextFormatStrategy tfs) {
        this.tfs = tfs;
    }
    
    @Override
    public final void writeFile() {
        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(filePath, append)));
        } catch (IOException ex) {
            
        }
    }
    
}
