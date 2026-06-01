package org.example.homework8;

import java.util.ArrayList;

public class Playlist {
    private String namePlaylist;
    private ArrayList <String> listMusic;

    public Playlist(String namePlaylist, ArrayList <String> listMusic) {
        this.namePlaylist = namePlaylist;
        this.listMusic = listMusic;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public ArrayList<String> getListMusic() {
        return listMusic;
    }

    public void setListMusic(ArrayList<String> listMusic) {
        this.listMusic = listMusic;
    }

    public void addMusic(String music) {
        listMusic.add(music);
        System.out.println("Добавлена песня: " + music);
    }

    public void deleteMusic(int index){
        System.out.println("Удалена песня: " + listMusic.get(index));
        listMusic.remove(index);
    }

    public void updateMusic(int index, String music) {
        System.out.printf("Обновлена песня: %s, новое название: %s%n", listMusic.get(index), music);
        listMusic.set(index, music);
    }

    public void getMusic(int index) {
        System.out.println("Получение песни по индексу: " + listMusic.get(index));
    }

    @Override
    public String toString() {
        return "Название плейлиста: " + namePlaylist + "\n" + "Список песен: " + listMusic;
    }
}
