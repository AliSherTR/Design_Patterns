package gof.BridgePattern.RefactoringGuru.remotes;

import gof.BridgePattern.RefactoringGuru.devices.Device;

public class UniversalRemote extends BasicRemote{


    public UniversalRemote(Device device){
        super.device = device;
    }

    public void maxVolume(){
        System.out.println("Max Volume: 100");
        device.setVolume(100);
    }

    public void turnOn() {
        System.out.println("AC is turned on");
        device.enable();
    }


}
