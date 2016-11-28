/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteapp;

/**
 *
 * @author Jenna
 */
public class FileService {
    private String filePath;
    private FileReaderStrategy reader;
    private FileWriterStrategy writer;

    public final FileReaderStrategy getReader() {
        return reader;
    }

    public final void setReader(FileReaderStrategy reader) {
        this.reader = reader;
    }

    public final FileWriterStrategy getWriter() {
        return writer;
    }

    public final void setWriter(FileWriterStrategy writer) {
        this.writer = writer;
    }
    
    public FileService(String filePath) {
        this.filePath = filePath;
    }
    
    public FileService() {
        
    }

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
}
