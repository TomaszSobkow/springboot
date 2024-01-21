package com.java.computer.file.image;

import com.java.computer.file.AbstractFile;
import com.java.computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String fileName, int fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public FileType getFileType() {
        return FileType.IMAGE;
    }
}
