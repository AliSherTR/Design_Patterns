public class VoiceMessageStrategy implements MessageStrategy{

    @Override
    public void sendMessage(Message message) {
        System.out.println("Voice message sent: " + message.getContent());
    }
}
