package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Logger {

    private File auditFile;
    private boolean appendMode;
    private PrintWriter auditWriter;

//instantiation - defining the constructor

    public Logger() throws FileNotFoundException {
        this.auditFile = new File ("log.txt");
        this.appendMode = true;
        this.auditWriter = new PrintWriter(new FileOutputStream(auditFile, appendMode));

    }

    public void log(String event){
        auditWriter.println(event);
        auditWriter.close();
    }
}
