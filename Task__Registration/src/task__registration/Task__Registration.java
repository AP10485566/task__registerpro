/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task__registration;

import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Task__Registration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskID;
    private String taskStatus;

    // Constructor
    public Task__Registration(String taskName, int taskNumber, String taskDescription, String developerDetails, double taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = createTaskID();
        this.taskStatus = taskStatus;
    }

    // Method to check task description length
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create task ID
    public String createTaskID() {
        String taskNamePrefix = taskName.substring(0, 2).toUpperCase();
        String developerLastNameSuffix = developerDetails.substring(developerDetails.lastIndexOf(" ") + 1);
        return taskNamePrefix + ":" + taskNumber + ":" + developerLastNameSuffix.toUpperCase();
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus +
                "\nDeveloper Details: " + developerDetails +
                "\nTask Number: " + taskNumber +
                "\nTask Name: " + taskName +
                "\nTask Description: " + taskDescription +
                "\nTask ID: " + taskID +
                "\nDuration: " + taskDuration;
    }

    // Getter for task duration
    public double getTaskDuration() {
        return taskDuration;
    }
    
    
    
}
        
   package task__registration;



public class EasyKanban {
    public static void main(String[] args) {
        boolean isAuthenticated = login();

        if (isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

            // Initialize variables
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks: "));
            Task__Registration[] tasks = new Task__Registration[numTasks];
            double totalHours = 0;

            // Task entry loop
            for (int i = 0; i < numTasks; i++) {
                String taskName = JOptionPane.showInputDialog("Enter Task Name: ");
                String taskDescription = JOptionPane.showInputDialog("Enter Task Description: ");
                String developerDetails = JOptionPane.showInputDialog("Enter Developer Details: ");
                double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter Task Duration (hours): "));
                String taskStatus = JOptionPane.showInputDialog("Enter Task Status (To Do, Done, or Doing): ");

                // Validate task description length
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                    i--; // Decrement i to allow re-entry of current task
                    continue;
                }

                // Create new Task object
                tasks[i] = new Task__Registration(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);

                // Update total hours
                totalHours += taskDuration;

                // Display task details
                JOptionPane.showMessageDialog(null, tasks[i].printTaskDetails());
            }

            // Display total hours
            JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);

        }
    }

    // Simulated login method
    private static boolean login() {
        // Simulated login credentials
        String username = "user";
        String password = "pass";

        // Prompt for credentials
        String inputUsername = JOptionPane.showInputDialog("Enter username: ");
        String inputPassword = JOptionPane.showInputDialog("Enter password: ");

        // Check credentials
        return username.equals(inputUsername) && password.equals(inputPassword);

    }
}

   
    

