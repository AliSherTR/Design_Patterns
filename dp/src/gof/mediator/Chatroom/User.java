package gof.mediator.Chatroom;

public class User implements MessageSender{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

    @Override
    public void sendMessage(User user, String message) {
        ChatRoom.showMessage(user, message);
    }
}
