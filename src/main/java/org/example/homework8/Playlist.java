package org.example.homework8;

import java.util.ArrayList;

public class Playlist {
    private String namePlaylist;
    private ArrayList <String> listMusic;

    public Playlist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
        this.listMusic = new ArrayList<>();
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public void addMusic(String music) {
        listMusic.add(music);
        System.out.println("Добавление песни: " + music);
    }

    public void deleteMusic(int index){
        if(index >= 0 && index < listMusic.size()) {
            System.out.println("Удаление песни: " + listMusic.get(index));
            listMusic.remove(index);
        }
        else System.out.println("Песни с данным индексом нет в списке");
    }

    public void updateMusic(int index, String music) {
        if(index >= 0 && index < listMusic.size()) {
            System.out.printf("Обновление песни: %s, новое название: %s%n", listMusic.get(index), music);
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
