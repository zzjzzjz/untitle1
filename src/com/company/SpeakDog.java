package com.company;

public class SpeakDog extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("狗");
        }
    }
}
