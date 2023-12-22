package gof.BridgePattern.RefactoringGuru.devices;

public class AC implements BasicDevice, Device {



    @Override
    public void turnOn(){
        System.out.println("AC is turned on with universal Remote ");
    }


    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {

    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void printStatus() {

    }
}
