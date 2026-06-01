package org.example.homework8;

import java.util.ArrayList;

public class Winamp {
    public static void main(String[] args) {
        ArrayList<String> listMusic = new ArrayList<>();
        listMusic.add("music1");
        listMusic.add("music2");
        listMusic.add("music3");
        listMusic.add("music4");
        listMusic.add("music5");

        Playlist playlist = new Playlist("lovePlaylist", listMusic);
        System.out.println(playlist);

        playlist.addMusic("newMusic");
        playlist.deleteMusic(1);
        playlist.updateMusic(2, "updateMusic");
        playlist.getMusic(4);

        System.out.println(playlist);
    }
}
