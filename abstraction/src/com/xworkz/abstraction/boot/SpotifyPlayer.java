package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.MusicPlayer;

public class SpotifyPlayer extends MusicPlayer {
    public void play() { System.out.println("Playing song on Spotify."); }
    public void pause() { System.out.println("Pausing song."); }
    public void stop() { System.out.println("Stopping song."); }
    public void nextTrack() { System.out.println("Playing next track."); }
    public void previousTrack() { System.out.println("Playing previous track."); }
}
