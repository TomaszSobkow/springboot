package com.java.computer.drive;

import com.java.computer.file.File;

public interface Drive {

    void addFile(File file);
    String fileList();
    File findFile(String fileName);

}
