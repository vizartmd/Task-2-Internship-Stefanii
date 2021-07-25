package stefanini;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserService userService = new UserService();
        TaskService taskService = new TaskService();
        File newFile = new File("users.txt");
        switch (args[0]) {
            case "createUser":
                userService.addUser(new User(args[1], args[2], args[3]));
                break;
            case "showAllUsers": {
                if (newFile.length() != 0) {
                    List<User> users = userService.showAllUsers();
                    if (users != null) {
                        for (User user : users) {
                            System.out.println(user.toString());
                        }
                    }
                }
                else {
                    System.out.println("User list is empty!");
                }
            } break;
            case "addTask": {
                if (newFile.length() != 0) {
                    List<User> users = userService.showAllUsers();
                    if (users != null) {
                        taskService.addTask(args[1], args[2], args[3]);
                    }
                }
                else {
                    System.out.println("User list is empty!");
                }
            } break;
            case "showTasks":
                taskService.showTasks(args[1]);
                break;
            default:
                System.out.println("Non-existent method!");
        }
    }

}
