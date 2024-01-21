package com.java.dataStructure.musicRepo.albums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Album{

    private String album;
    private Date releaseDate;

}

