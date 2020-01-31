package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album1 {
    private String name;
    private String artist;
    private SongList songs;

    public Album1(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    private class SongList {
        private ArrayList<Song1> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song1 song1) {
            if (songs.contains(song1)) {
                return false;
            } else {
                this.songs.add(song1);
                return true;
            }
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

        private Song1 findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null; // Thảm họa luôn,để sai vào trong ngoặc của for xong rồi chạy mãi không được
            //Mất tận nửa tiếng mới tìm ra, muốn phát điên!!!
        }
    }

//    public void printSong() {
//        for (int i = 0; i < this.songs.size(); i++) {
//            System.out.println((i + 1) + ": " + this.songs.get(i));
//        }
//    }


//    private Song1 findSong(String title) {
//        for (Song1 checkedSong : this.songs) {
//            if (checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null; // Thảm họa luôn,để sai vào trong ngoặc của for xong rồi chạy mãi không được
//        //Mất tận nửa tiếng mới tìm ra, muốn phát điên!!!
//    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song1(title, duration));
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song1> playList) {
        Song1 checkSong = this.songs.findSong(trackNumber);

        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("Song with track number " + trackNumber + " is not exist in album.");
        return false;
    }


    public boolean addSongToPlaylist(String title, LinkedList<Song1> playList) {
        Song1 song = this.songs.findSong(title);

        if (song != null) {
            playList.add(song);
            return true;
        } else {
            System.out.println("The song " + title + " is not in this album.");
            return false;
        }
    }
}
