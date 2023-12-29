import java.util.ArrayList;
import java.util.List;

public class CommunicationSystemFacade {

    private MessageStrategy messageStrategy;
    private List<StakeholderObserver> observers;

    public CommunicationSystemFacade(MessageStrategy messageStrategy) {
        this.observers = new ArrayList<>();
        this.messageStrategy = messageStrategy;
    }

    public void Communicate(Message message) {
        messageStrategy.sendMessage(message);
        CommunicateAll(message);
    }

     void CommunicateAll(Message message) {
        for (StakeholderObserver observer : observers) {
            observer.update(message);
        }
    }

    void registerObserver(StakeholderObserver observer){
        observers.add(observer);
    }

    void removeObserver(StakeholderObserver observer){
        observers.add(observer);
    }


}
