package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Camera;

public class DSLRCamera extends Camera {
    public DSLRCamera(String name) {
        super(name);
    }
    @Override
    public void storageInfo()
    {
        System.out.println("Storage Supports SD cards up to 256GB.");
    }


    public    void clickPhoto()
    { System.out.println("Clicking high-resolution photo."); }
    public   void recordVideo()
    { System.out.println("Recording 4K video."); }
    public void zoomIn()
    { System.out.println("Zooming in."); }
    public void zoomOut()
    { System.out.println("Zooming out."); }
    public void deletePhoto()
    { System.out.println("Deleting photo from memory card."); }
}
