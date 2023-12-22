package gof.BridgePattern.RefactoringGuru;

import gof.BridgePattern.RefactoringGuru.devices.Device;
import gof.BridgePattern.RefactoringGuru.devices.Radio;
import gof.BridgePattern.RefactoringGuru.devices.TV;
import gof.BridgePattern.RefactoringGuru.remotes.AdvancedRemote;
import gof.BridgePattern.RefactoringGuru.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
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
    }
}
