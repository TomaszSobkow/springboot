package com.java.dataStructure.musicRepo.bands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Band {

    private String band;
    private Date created;

}
