package com.java.dataStructure.musicRepo;

import com.java.dataStructure.musicRepo.bands.Band;
import com.java.dataStructure.musicRepo.songs.Song;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class SongRepo {

    private List<Band> bands = new ArrayList<>();



    public HashSet<Song> songs(){
        HashSet<Song> songs = new HashSet<>();
        songs.add(new Song("No Limit"));


        return songs;
    }


}
