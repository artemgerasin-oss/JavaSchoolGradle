package ru.alfabank.HomeWork_8;

import org.w3c.dom.ls.LSOutput;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Playlist {
    private String playListName;
    private ArrayList<String> songs = new ArrayList<>();
    private int indexSong;

    //конструктор
    public Playlist(String playListName) {
        this.playListName = playListName;
        this.songs = new ArrayList<>();
    }

    public void addSong(String songName) {
        songs.add(songName);
        System.out.println("A song - " + songName + ", has been added to the playlist - " + playListName);

    }

    public void addSong(String songName, int indexSong) {
        this.indexSong = indexSong;
        songs.add(indexSong, songName);
        System.out.println("A song - " + songName + ", has been added to the playlist - " + playListName + " on position = (" + indexSong + ")");

    }

    public String getSongByIndex(int indexSong) {
        if (indexSong >= 0 && indexSong < songs.size()) {
            String result = songs.get(indexSong);
            System.out.println("On this index " + indexSong + " get song by " + result);
            return result;
        } else
            System.out.println("The entered value  " + indexSong + " is out of range (0-" + (songs.size() - 1) + ")");
        return null;
    }



    public void deleteSongByIndex (int indexSong){
        if (indexSong >= 0 && indexSong < songs.size()){
            songs.remove(indexSong);
            System.out.println("From an array - " + playListName + " delete composition by index - " + indexSong);

        }else
            System.out.println("The entered value  " + indexSong + " is out of range (0-" + (songs.size() - 1) + ")");

    }

}
