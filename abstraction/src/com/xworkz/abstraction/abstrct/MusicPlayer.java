package com.xworkz.abstraction.abstrct;

public abstract class MusicPlayer {
    int volume;
    public MusicPlayer(int voulume){
        this();
        this.volume=volume;
    }
    public MusicPlayer(){

    }
   public abstract void play();
   public abstract void pause();
    public abstract void stop();
    public abstract void nextTrack();
    public abstract void previousTrack();
    public static void musicRules() {
        System.out.println("All music players must follow audio streaming standards.");
    }

    public void volumeInfo() {

        System.out.println("Volume range is 0 to 100.");
    }

    public void subscriptionInfo() {

        System.out.println("Premium subscription available for ad-free songs.");
    }

}




