package gof.mediator.Chatroom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        List<User> targets = new ArrayList<>();
        targets.add(robert);
        targets.add(john);

        // Sending a message to a specific target set of colleagues
        ChatRoom.sendMessageToTargets(robert, targets, "Hello there! This is a targeted message.");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

        robert.sendMessage(john , "hello john how are you?");
    }
}
