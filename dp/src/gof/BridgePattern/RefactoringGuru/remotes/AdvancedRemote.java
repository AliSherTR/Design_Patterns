package gof.BridgePattern.RefactoringGuru.remotes;

import gof.BridgePattern.RefactoringGuru.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}