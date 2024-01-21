package com.java.dataStructure.musicRepo;

import com.java.dataStructure.musicRepo.albums.Album;
import com.java.dataStructure.musicRepo.bands.Band;
import com.java.dataStructure.musicRepo.songs.Song;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class MusicApp {

    private HashMap< List<Band>, HashMap<HashSet<Album>,List<Song>>> musicCollection = new HashMap<>();

    public List<Band> bandsList(){
        List<Band> bands = new ArrayList<>();
        musicCollection.keySet().
                forEach(band -> band.
                forEach(b -> bands.
                add(new Band(b.getBand(),b.getCreated()))));
    return bands;
    }

    public  List<Album> allAlbums(){
        List<Album> albums = new ArrayList<>();
        musicCollection.values().forEach( key -> key.keySet().
                forEach(a -> a.
                forEach(album -> albums.
                add(new Album(album.getAlbum(),album.getReleaseDate())))));

        return albums;
    }

    public List<Band> allAlbumsForBand(Band band){
        List<Band> albums = new ArrayList<>();
                musicCollection.keySet().forEach(d -> d.forEach(data-> albums.add(new Band(data.getBand(), data.getCreated()))));

        return albums.stream().
                filter(newBand -> newBand.getBand().equals(band.getBand())).
                collect(Collectors.toList());
    }

    public void songsList(){

    }

}



