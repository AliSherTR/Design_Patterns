public class Main {
    public static void main(String[] args) {
        CommunicationSystemFacade communicationSystem = new CommunicationSystemFacade(new TextMessageStrategy());
        StakeholderObserver observer1 = new StakeHolderOne();
        StakeholderObserver observer2 = new StakeHolderOne();

        Message textMessage = new Message("Hello How Are You");
        Message VoiceMessage = new Message("I am a voice message");

        communicationSystem.Communicate(textMessage);
        communicationSystem.Communicate(VoiceMessage);

        communicationSystem.registerObserver(observer1);
        communicationSystem.registerObserver(observer2);

        communicationSystem.CommunicateAll(textMessage);



    }
}