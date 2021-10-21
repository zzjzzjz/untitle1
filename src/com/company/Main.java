package com.company;

public class Main {

    public static void main(String[] args) {
	SpeakElephant speak=new SpeakElephant();
    speak.start();
    for(int i=0;i<3000;i++) {
        System.out.println("主线");
    }
    }
}

