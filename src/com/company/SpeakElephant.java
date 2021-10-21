package com.company;

public class SpeakElephant extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("Elephant");
        }
    }
}
