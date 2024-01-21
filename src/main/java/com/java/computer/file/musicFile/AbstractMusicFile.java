package com.java.computer.file.musicFile;

import com.java.computer.file.AbstractFile;
import com.java.computer.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {

    String bandName, title;

    protected AbstractMusicFile(String fileName, int fileSize, String bandName, String title) {
        super(fileName, fileSize);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }
}
