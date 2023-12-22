package gof.BridgePattern.RefactoringGuru;

import gof.BridgePattern.RefactoringGuru.devices.AC;
import gof.BridgePattern.RefactoringGuru.devices.Device;
import gof.BridgePattern.RefactoringGuru.devices.Radio;
import gof.BridgePattern.RefactoringGuru.devices.TV;
import gof.BridgePattern.RefactoringGuru.remotes.AdvancedRemote;
import gof.BridgePattern.RefactoringGuru.remotes.BasicRemote;
import gof.BridgePattern.RefactoringGuru.remotes.UniversalRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
        testDevice(new AC());

    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();


        System.out.println("Tests With universal Remote");
        UniversalRemote universalRemote = new UniversalRemote(device);
        universalRemote.maxVolume();

        System.out.println("Tests with AC ");
        universalRemote.turnOn();


    }
}
