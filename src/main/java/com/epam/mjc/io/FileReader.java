package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (FileInputStream inputStream = new FileInputStream(file)){
            return new Profile(inputStream);
        } catch (IOException ignored){
            return null;
        }
    }
}
