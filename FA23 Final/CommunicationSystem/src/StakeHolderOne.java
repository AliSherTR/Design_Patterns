public class StakeHolderOne implements StakeholderObserver {
    public void update(Message message) {
        System.out.println("Received Message: " + message.getContent());
    }
}
