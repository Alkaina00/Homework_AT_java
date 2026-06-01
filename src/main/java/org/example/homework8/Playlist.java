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
        if(index >= 0 && index < listMusic.size()) {
            System.out.println("Удалена песня: " + listMusic.get(index));
            listMusic.remove(index);
        }
        else System.out.println("Песни с данным индексом нет в списке");
    }

    public void updateMusic(int index, String music) {
        if(index >= 0 && index < listMusic.size()) {
            System.out.printf("Обновлена песня: %s, новое название: %s%n", listMusic.get(index), music);
            listMusic.set(index, music);
        }
        else System.out.println("Песни с данным индексом нет в списке");
    }

    public String getMusic(int index) {
        if(index >= 0 && index < listMusic.size()) {
            System.out.println("Получение песни по индексу: " + listMusic.get(index));
            return listMusic.get(index);
        }
        else {
            System.out.println("Песни с данным индексом нет в списке");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Название плейлиста: " + namePlaylist + "\n" + "Список песен: " + listMusic;
    }
}
