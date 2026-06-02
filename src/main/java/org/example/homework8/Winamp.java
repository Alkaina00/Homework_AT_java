package org.example.homework8;

import java.util.ArrayList;

public class Winamp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("lovePlaylist");

        System.out.println("Добавление песен в плейлист...");
        playlist.addMusic("music1");
        playlist.addMusic("music2");
        playlist.addMusic("music3");
        playlist.addMusic("music4");
        playlist.addMusic("music5");
        System.out.println();

        System.out.println(playlist);
        System.out.println();

        System.out.println("-----Позитивные проверки-----");
        playlist.addMusic("newMusic");
        playlist.deleteMusic(3);
        playlist.updateMusic(2, "updateMusic");
        playlist.getMusic(4);
        System.out.println();

        System.out.println("-----Негативные проверки-----");
        playlist.deleteMusic(100);
        playlist.updateMusic(100, "updateMusic");
        playlist.getMusic(100);
        System.out.println();

        System.out.println(playlist);
    }
}
