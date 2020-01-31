package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String name, String duration) {
        if(findSong(name) == null) {
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String name) {
        for(int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if(song.getTitle().equals(name));
            return song;
        }
        return null;
    }
}
