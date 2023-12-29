class TextMessageStrategy implements MessageStrategy {
    @Override
    public void sendMessage(Message message) {
        System.out.println("message sent: " + message.getContent());
    }
}
