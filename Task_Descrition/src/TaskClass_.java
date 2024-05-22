/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class TaskClass_ {
    private List<Task> tasks;
    private int totalHours;

    public TaskClass_() {
        tasks = new ArrayList<>();
        totalHours = 0;
    }

    public void run(UserAuth userAuth) {
        String loginUsername = JOptionPane.showInputDialog("Enter username:");
        String loginPassword = JOptionPane.showInputDialog("Enter password:");

        if (userAuth.loginUser(loginUsername, loginPassword)) {
            JOptionPane.showMessageDialog(null, userAuth.getLoginStatus(true));
            int choice;
            do {
                String input = JOptionPane.showInputDialog("Choose an option:\n1. Add tasks\n2. Show report\n3. Quit");
                choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
                        for (int i = 0; i < numTasks; i++) {
                            String taskName = JOptionPane.showInputDialog("Enter task name:");
                            String taskDescription = JOptionPane.showInputDialog("Enter task description:");
                            int taskHours = Integer.parseInt(JOptionPane.showInputDialog("Enter task hours:"));
                            tasks.add(new Task(taskName, taskDescription, taskHours));
                            totalHours += taskHours;
                        }
                        break;
                    case 2:
                        StringBuilder report = new StringBuilder("Tasks Report:\n");
                        for (Task task : tasks) {
                            report.append(task).append("\n");
                        }
                        report.append("Total hours: ").append(totalHours);
                        JOptionPane.showMessageDialog(null, report.toString());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Quitting...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please select again.");
                }
            } while (choice != 3);
        } else {
            JOptionPane.showMessageDialog(null, userAuth.getLoginStatus(false));
        }
    }

    public static void main(String[] args) {
        // Register a new user (Example)
        UserAuth userAuth = new UserAuth("user_", "Password1!", "John", "Doe");
        JOptionPane.showMessageDialog(null, userAuth.registerUser());

        // Run the TaskClass_ functionality
        TaskClass_ taskManager = new TaskClass_();
        taskManager.run(userAuth);
    }
}

class Task {
    private String name;
    private String description;
    private int hours;

    public Task(String name, String description, int hours) {
        this.name = name;
        this.description = description;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', description='" + description + "', hours=" + hours + '}';
    }
}


