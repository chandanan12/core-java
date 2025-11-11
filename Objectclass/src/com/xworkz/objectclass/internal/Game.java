package com.xworkz.objectclass.internal;

public class Game {
    public String name;
    public String genre;
    public double sizeInGB;
    public boolean isMultiplayer;
    public int levels;

    public Game() {
        System.out.println("Game created");
    }

    public Game(String name, String genre, double sizeInGB, boolean isMultiplayer, int levels) {
        this.name = name;
        this.genre = genre;
        this.sizeInGB = sizeInGB;
        this.isMultiplayer = isMultiplayer;
        this.levels = levels;
    }

    public String toString() {
        return "Game{name=" + name + ", genre=" + genre + ", sizeInGB=" + sizeInGB +
                ", isMultiplayer=" + isMultiplayer + ", levels=" + levels + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Game)) return false;
        Game g = (Game) obj;
        return name.equals(g.name) && genre.equals(g.genre) &&
                sizeInGB == g.sizeInGB && isMultiplayer == g.isMultiplayer && levels == g.levels;
    }
}
