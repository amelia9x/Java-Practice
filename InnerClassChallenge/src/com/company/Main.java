package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album1> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album1 album1 = new Album1("Your name", "OST Your Name");
        Album1 album2 = new Album1("Lalaland", "Lalaland OST");
        Album1 album3 = new Album1("Tam 9", "My Tam");

        album1.addSong("Hana", 3.40);
        album1.addSong("Sayonara no natsu", 3.50);
        album1.addSong("Sprited Away", 4.0);

        album2.addSong("La la la", 3.45);
        album2.addSong("Another Sun of Day", 3.55);
        album2.addSong("Someone in crowd", 4.05);

        album3.addSong("Xa anh", 3.35);
        album3.addSong("Mau cua nang", 3.05);
        album3.addSong("Trai tim em cung biet dau", 4.55);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);


        LinkedList<Song1> playList = new LinkedList<>();

        albums.get(0).addSongToPlaylist(1, playList);
        albums.get(0).addSongToPlaylist(2, playList);
        albums.get(0).addSongToPlaylist(3, playList);
        albums.get(1).addSongToPlaylist("La la la", playList);
        albums.get(1).addSongToPlaylist("Another Sun of Day", playList);
        albums.get(2).addSongToPlaylist("Trai tim em cung biet dau", playList);
        albums.get(2).addSongToPlaylist(1, playList);
        albums.get(1).addSongToPlaylist(4, playList);
        albums.get(2).addSongToPlaylist("Hat len nao", playList);

        play(playList);

    }

    public static void printList(LinkedList linkedList) {
        Iterator j = linkedList.iterator();
        System.out.println("The song in playlist: ");
        for (int i = 0; i < linkedList.size(); i++) {
            if (j.hasNext()) {
                System.out.println((i + 1) + ". " + j.next());
            }
        }
    }

    public static void play(LinkedList playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean moveForward = true;
        boolean replay = true;

        ListIterator<Song1> songListIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("There is no song in playlist.");
            return; // Thêm làm gì ta?
        } else {
            System.out.println("Now playing " + songListIterator.next().toString());
            printAction();
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Stopped playing music.");
                    quit = true;
                    break;
                case 1:
                    if (!moveForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        moveForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of playlist.");
                        moveForward = false;
                    }
                    break;
                case 2:
                    if (moveForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        moveForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of playlist.");
                        moveForward = true;
                    }
                    break;
                case 3:
                    if(moveForward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                            moveForward = false;
                        } else {
                            System.out.println("Reached the start of playlist.");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next().toString());
                            moveForward = true;
                        } else {
                            System.out.println("Reached the end of playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printAction();
                    break;
                case 6:
                    if(playlist.size() >= 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next().toString());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    public static void printAction() {
        System.out.println("Available actions:\n Press:");
        System.out.println("0 - to quit\n" +
                "1 - to play next song.\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - to print all song in playlist out\n" +
                "5 - to print action Menu.\n" +
                "6 - to remove current song.");
    }

}

// Mình viết
//private static Scanner scanner = new Scanner(System.in);
//
//    private static ArrayList<Album> albums = new ArrayList<>();
//
//    public static void main(String[] args) {
//        LinkedList<Song> playList = new LinkedList<>();
//        Album album1 = new Album("Sing La La");
//        Album album2 = new Album("Hug the World");
//        Album album3 = new Album("I Love You");
//
//        album1.addSong("Hana", "3m 40s");
//        album1.addSong("Sayonaro no natsu", "3m 50s");
//        album1.addSong("Sprited Away", "4m 00s");
//
//        album2.addSong("La la la", "3m 45s");
//        album2.addSong("Another Sun of Day", "3m 55s");
//        album2.addSong("Someone in crowd", "4m 05s");
//
//        album3.addSong("Xa anh", "3m 35s");
//        album3.addSong("Mau cua nang", "3m 05s");
//        album3.addSong("Trai tim em cung biet dau", "4m 55s");
//
//        playList.add(album1.songs.get(0));
//        playList.add(album2.songs.get(0));
//        playList.add(album3.songs.get(0));
//
//        printList(playList);
//        actionList(playList);
//
//    }
//
//    public static void printList(LinkedList linkedList) {
//        Iterator j = linkedList.iterator();
//        for(int i = 0; i < linkedList.size(); i++) {
//            if (j.hasNext()) {
//                System.out.println((i + 1) + ". " + j.next());
//            }
//        }
//    }
//
//    public static void actionList(LinkedList playlist) {
//        boolean quit = false;
//        boolean moveForward = true;
//        boolean replay = true;
//        printAction();
//
//        ListIterator<Song> songListIterator = playlist.listIterator();
//
//        if (playlist.isEmpty()) {
//            System.out.println("There is no song in playlist.");
//        } else {
//            System.out.println("Now playing " + songListIterator.next().toString());
//        }
//
//        while (!quit) {
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    System.out.println("Stopped playing music.");
//                    quit = true;
//                    break;
//                case 1:
//                    if (!moveForward) {
//                        if (songListIterator.hasNext()) {
//                            songListIterator.next().toString();
//                        }
//                        moveForward = true;
//                    }
//                    if (songListIterator.hasNext()) {
//                        System.out.println("Now playing " + songListIterator.next().toString());
//                    } else {
//                        System.out.println("Reached the end of playlist.");
//                        moveForward = false;
//                    }
//                    break;
//                case 2:
//                    if (moveForward) {
//                        if (songListIterator.hasPrevious()) {
//                            songListIterator.previous().toString();
//                        }
//                        moveForward = false;
//                    }
//                    if (songListIterator.hasPrevious()) {
//                        System.out.println("Now playing " + songListIterator.previous().toString());
//                    } else {
//                        System.out.println("Reached the start of playlist.");
//                        moveForward = true;
//                    }
//                    break;
//                case 3:
//                    if (replay) {
//                        System.out.println("Now playing " + songListIterator.next().toString());
//                        replay = false;
//                    }
//                    break;
//                case 4:
//                    printList(playlist);
//                    break;
//                case 5:
//                    printAction();
//                    break;
//            }
//        }
//    }
//
//    public static void printAction() {
//        System.out.println("Available actions:\n Press:");
//        System.out.println("0 - to quit\n" +
//                "1 - to go next song.\n" +
//                "2 - to come back previous song\n" +
//                "3 - to replay current song\n" +
//                "4 - to print all song in playlist out\n" +
//                "5 - to print action Menu.");
//    }
