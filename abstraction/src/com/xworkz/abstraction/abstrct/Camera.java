package com.xworkz.abstraction.abstrct;

public abstract class Camera {
    public String name;
    public Camera(String name){
        this();
        this.name=name;
    }
    public Camera(){

    }
   public abstract void clickPhoto();
   public abstract void recordVideo();
   public abstract void zoomIn();
    public abstract void zoomOut();
    public abstract void deletePhoto();
    public static void cameraRules()
    {
        System.out.println("All cameras must follow international imaging standards.");
    }

   public void storageInfo()
   {
        System.out.println("Storage: Supports SD cards up to 256GB.");
    }

   public void batteryInfo()
   {
        System.out.println("Battery backup: 800 shots per charge.");
    }

}



