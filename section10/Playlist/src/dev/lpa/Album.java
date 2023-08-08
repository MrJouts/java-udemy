package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) return false;
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().contains(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        if (track > songs.size() || track < 1) return false;
        playList.add(songs.get(track - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song foundSong = findSong(title);
        if (foundSong == null) return false;
        playList.add(foundSong);
        return true;
    }
}
