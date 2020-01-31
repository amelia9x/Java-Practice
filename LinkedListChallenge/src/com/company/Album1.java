package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album1 {
    private String name;
    private String artist;
    private ArrayList<Song1> songs;

    public Album1(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void printSong() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ": " + songs.get(i));
        }
    }

    public boolean addSong(String title, double duration) {
        Song1 song = new Song1(title, duration);
        if (findSong(title) == null) {
            this.songs.add(song);
            return true;
        }
        System.out.println("That song with title " + title + " is already in album.");
        return false;
    }

    private Song1 findSong(String title) {
        for (Song1 checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null; // Thảm họa luôn,để sai vào trong ngoặc của for xong rồi chạy mãi không được
        //Mất tận nửa tiếng mới tìm ra, muốn phát điên!!!
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song1> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("Song with track number " + trackNumber + " is not exist in album.");
            return false;
        }
    }

    public boolean addSongToPlaylist(String title, LinkedList<Song1> playList) {
        Song1 song = findSong(title);
        if (findSong(title) != null) {
            playList.add(song);
            return true;
        } else {
            System.out.println("The song " + title + " is not in this album.");
            return false;
        }
    }
}
