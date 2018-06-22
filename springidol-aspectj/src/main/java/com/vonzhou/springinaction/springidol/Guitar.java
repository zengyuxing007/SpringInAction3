package com.vonzhou.springinaction.springidol;

public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
        //throw new Exception("aaaaa!");
        int c= 1/0;
    }
}
