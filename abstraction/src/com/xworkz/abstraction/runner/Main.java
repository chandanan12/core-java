package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.abstrct.*;
import com.xworkz.abstraction.boot.*;


public class Main {
    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        a.turnOn();
        a.energyUse();
        a.brand();
        a.repair();
        a.turnOff();
        Vehicle v = new Car();
                v.start();
                v.accelerate();
                v.brake();
                v.stop();
                v.fuelType();
        Computer c = new Laptop();
        c.boot(); c.installSoftware(); c.runProgram(); c.uninstallSoftware(); c.shutdown();
        Airline b = new Emirates();
        b.bookTicket();
        b.checkIn();
        b.boardFlight();
        b.provideMeal();
        b.cancelTicket();
        MusicPlayer m = new SpotifyPlayer();
        m.play(); m.nextTrack(); m.pause(); m.previousTrack(); m.stop();
        Camera camera = new DSLRCamera();
        camera.clickPhoto(); camera.zoomIn(); camera.recordVideo(); camera.zoomOut(); camera.deletePhoto();
        Robot r = new ServiceRobot();
        r.startTask(); r.speak(); r.walk(); r.stopTask(); r.chargeBattery();
        Payment p = new UpiPayment();
        p.makePayment(); p.verifyTransaction(); p.generateReceipt(); p.checkBalance(); p.refund();
        Transport t = new Bus();
        t.start(); t.accelerate(); t.honk(); t.refuel(); t.stop();
        DeliveryService d = new AmazonDelivery();
        d.acceptOrder(); d.packItem(); d.dispatchOrder(); d.trackOrder(); d.deliverOrder();
        Fan f = new CeilingFan();
        f.turnOn();
        f.increaseSpeed();
        f.rotate();
        f.decreaseSpeed();
        f.turnOff();
        FloorGrindMachine machine = new ConcreteGrinder();
        machine.startMachine();
        machine.adjustSpeed();
        machine.cleanSurface();
        machine.replaceBlade();
        machine.stopMachine();
        SewingMachine x = new AutomaticSewingMachine();
        x.startMachine();
        x.stitchCloth();
        x.adjustSpeed();
        x.changeNeedle();
        x.stopMachine();
        Bluetooth device = new BluetoothSpeaker();
        device.turnOn();
        device.connectDevice();
        device.checkBattery();
        device.disconnectDevice();
        device.turnOff();
        IrrigationSystem irrigation = new DripIrrigation();
        irrigation.turnOnPump();
        irrigation.setWaterLevel();
        irrigation.startSprinklers();
        irrigation.monitorMoisture();
        irrigation.turnOffPump();
        Tractor tractor = new FarmTractor();
        tractor.startEngine();
        tractor.ploughField();
        tractor.sowSeeds();
        tractor.carryLoad();
        tractor.stopEngine();
        EmbroideryMachine em = new ComputerizedEmbroidery();
        em.startMachine();
        em.loadPattern();
        em.changeThreadColor();
        em.adjustSpeed();
        em.stopMachine();
        Mobile mobile = new SmartPhone();
        mobile.call();
        mobile.message();
        mobile.camera();
        mobile.playMusic();
        mobile.chargeBattery();
        SmartWatch sw = new DigitalSmartWatch();
        sw.trackSteps();
        sw.checkHeartRate();
        sw.showNotifications();
        sw.connectMobile();
        sw.chargeWatch();
        PowerBank pb = new FastPowerBank();
        pb.turnOn();
        pb.chargeMobile();
        pb.checkBatteryLevel();
        pb.enableFastCharging();
        pb.turnOff();

    }
    }










