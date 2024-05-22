

package task__registration;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */


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

    
    
    
