package com.vonzhou.springinaction.springidolaop;

public class SongBook {
    private String[] songTitles;

    public SongBook(String[] songTitles) {
        this.songTitles = songTitles;
    }

    public String pickASong() {
        int index=(int)(Math.random()*songTitles.length);
        return songTitles[index];
    }
}
