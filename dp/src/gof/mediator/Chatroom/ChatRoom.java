package gof.mediator.Chatroom;

import java.util.Date;
import java.util.List;


// mediator class which has a method to notify named as "showMessage"
public class ChatRoom {
    public static void showMessage(User user , String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

    public static void sendMessageToTargets(User sender, List<User> targets, String message) {
        for (User target : targets) {
            showMessage(sender, "Direct message to " + target.getName() + ": " + message);
        }
    }
}
