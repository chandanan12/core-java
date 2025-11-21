package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.abstrct.*;
import com.xworkz.abstraction.boot.*;


public class Main {
    public static void main(String[] args) {
        Appliance a = new WashingMachine(20000);
        a.turnOn();
        a.energyUse();
        a.brand();
        a.repair();
        a.turnOff();
        Appliance.applianceRules();
        a.warrantyInfo();
        a.customerSupport();

        Vehicle v = new Car(80);
                v.start();
                v.accelerate();
//                v.brake();
                v.stop();
//                v.fuelType();
        v.serviceInfo();
        v.insuranceDetails();
        Vehicle.vehicleRules();

        Computer c = new Laptop("black");
        c.boot();
        c.installSoftware();
        c.runProgram();
        c.uninstallSoftware();
        c.shutdown();
        c.deviceInfo();
        c.warrantyStatus();
        Computer.computerRules();

        Airline.showGuidelines();
       Airline b = new Emirates(true);
        b.bookTicket();
        b.checkIn();
        b.boardFlight();
        b.provideMeal();
        b.cancelTicket();
        b.baggageDetails();
        b.customerHelpdesk();

        MusicPlayer m = new SpotifyPlayer(10);
        m.play(); m.nextTrack();
        m.pause();
        m.previousTrack();
        m.stop();
        MusicPlayer.musicRules();
        m.volumeInfo();
        m.subscriptionInfo();

        Camera camera = new DSLRCamera("dual camera");
        camera.clickPhoto();
        camera.zoomIn();
        camera.recordVideo();
        camera.zoomOut();
        camera.deletePhoto();
        Camera.cameraRules();
        camera.storageInfo();
        camera.batteryInfo();

        Robot r = new ServiceRobot('A');
        r.startTask();
        r.speak();
        r.walk();
        r.stopTask();
        r.chargeBattery();
        Robot.robotGuidelines();
        r.batteryStatus();
        r.maintenanceInfo();

    Payment p = new UpiPayment(10000);
        p.makePayment();
        p.verifyTransaction();
        p.generateReceipt();
        p.checkBalance();
        p.refund();
        Payment.paymentRules();
        p.customerSupport();
        p.transactionLimit();

        Transport t = new Bus(100);
        t.start();
        t.accelerate();
        t.honk();
        t.refuel();
        t.stop();
        Transport.transportRules();
        t.serviceDetails();
        t.vehicleType();

        DeliveryService d = new AmazonDelivery("chandu");
        d.acceptOrder();
        d.packItem();
        d.dispatchOrder();
        d.trackOrder();
        d.deliverOrder();
        DeliveryService.serviceArea();
        d.showCompanyName();
        d.showDeliveryType();

        Fan f = new CeilingFan(4000);
        f.turnOn();
        f.increaseSpeed();
        f.rotate();
        f.decreaseSpeed();
        f.turnOff();
        CeilingFan cf = new CeilingFan(4000);
        cf.showBrand();
        cf.showColor();
        CeilingFan.powerSupplyType();

        FloorGrindMachine machine = new ConcreteGrinder(40);
        machine.startMachine();
        machine.adjustSpeed();
        machine.cleanSurface();
        machine.replaceBlade();
        machine.stopMachine();
        machine.showBrand();
        machine.showPower();
        ConcreteGrinder.machineType();


        SewingMachine x = new AutomaticSewingMachine(10);
        x.startMachine();
        x.stitchCloth();
        x.adjustSpeed();
        x.changeNeedle();
        x.stopMachine();
        x.showModel();
        x.showWarranty();
        AutomaticSewingMachine.machineCategory();


        Bluetooth device = new BluetoothSpeaker(650);
        device.turnOn();
        device.connectDevice();
        device.checkBattery();
        device.disconnectDevice();
        device.turnOff();
        device.showBrand();
        device.speakerMode();
        BluetoothSpeaker.bluetoothVersion();

        IrrigationSystem irrigation = new DripIrrigation("Drip");
        irrigation.turnOnPump();
        irrigation.setWaterLevel();
        irrigation.startSprinklers();
        irrigation.monitorMoisture();
        irrigation.turnOffPump();
        irrigation.systemBrand();
        irrigation.irrigationMode();
        DripIrrigation.irrigationVersion();


        Tractor tractor = new FarmTractor(100);
        tractor.startEngine();
        tractor.ploughField();
        tractor.sowSeeds();
        tractor.carryLoad();
        tractor.stopEngine();
        tractor.showBrand();
        tractor.tractorMode();
        FarmTractor.tractorVersion();


        EmbroideryMachine em = new ComputerizedEmbroidery("computer");
        em.startMachine();
        em.loadPattern();
        em.changeThreadColor();
        em.adjustSpeed();
        em.stopMachine();
        em.showBrand();
        em.machineMode();
        ComputerizedEmbroidery.machineVersion();


        Mobile mobile = new SmartPhone(true);
        mobile.call();
        mobile.message();
        mobile.camera();
        mobile.playMusic();
        mobile.chargeBattery();
        mobile.showBrand();
        mobile.mobileMode();
        SmartPhone.osVersion();


        SmartWatch sw = new DigitalSmartWatch((float) 100 /70);
        sw.trackSteps();
        sw.checkHeartRate();
        sw.showNotifications();
        sw.connectMobile();
        sw.chargeWatch();
        sw.showBrand();
        sw.watchMode();
        DigitalSmartWatch.softwareVersion();

        PowerBank pb = new FastPowerBank(100);
        pb.turnOn();
        pb.chargeMobile();
        pb.checkBatteryLevel();
        pb.enableFastCharging();
        pb.turnOff();

    }
    }










