/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part.pkg1.pkgnew;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Task2 {
    // refrence www.solutionfiles.com 
   public String checkTaskDescription(String taskDescription){
       if(taskDescription.length()>50){ 
      return "Task successfully captured";
       }
       else{return "Please enter a task description of less than 50 characters";}  
       
    }
    public String createTaskID(String taskName, int taskNumber, 
            String developerName){
      String taskID = taskName.substring(0,2) +"."+ Integer.toString(taskNumber)
              + "."+ developerName.substring(developerName.length()-3);
      return taskID.toUpperCase();    
    }  
    
public String printTaskDetails(String taskName, int taskNumber, String taskDescription ,
String Firstname, String Lastname, int taskDuration, String taskID, String taskStatus ){
String printValue = taskName+ " " + Integer.toString(taskNumber)+ " " + taskDescription + " " + Firstname+ " " + Lastname+ " " + Integer.toString(taskDuration)+" " + taskID+ " "+ taskStatus ;
return printValue;
        
 }
public int returnTotalHours(int numTask,int enterdHours ){
    int TotalHours = 0;
    for (int i =0;i < numTask;i++ ){ TotalHours+=enterdHours;}
    return TotalHours;
}

    String returnTotalHours(String numTask, String enterdHours) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         
      
       
       
    }

    void printTaskDetails(String[] TaskName, int Tasknumber, String string, String Firstname, String Lastname, int[] Duration, String string0, String[] Taskstatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    


