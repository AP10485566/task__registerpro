
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     EasyKanban EasyKanbanObject = new EasyKanban();
     
     JOptionPane.showInputDialog("Welcome to EasyKanban, : Answer A Yes to enter details : ");
     EasyKanbanObject.SimpleMessage("");
      
     
     
    }
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskID;
    private String taskStatus;

    // Constructor
    public main(String taskName, int taskNumber, String taskDescription, String developerDetails, double taskDuration, String taskStatus) {
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
  
    
    

