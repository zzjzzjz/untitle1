package com.company;

public class Main {

    public static void main(String[] args) {
	SpeakElephant speake=new SpeakElephant();
    SpeakCat speakc=new SpeakCat();
    SpeakDog speakd=new SpeakDog();
    speake.start();
    speakc.start();
    speakd.start();
    for(int i=0;i<300;i++) {
        System.out.println("主线");
    }
    }
}

