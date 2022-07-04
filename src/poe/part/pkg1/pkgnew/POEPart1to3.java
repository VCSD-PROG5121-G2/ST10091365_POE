/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg1.pkgnew;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class POEPart1to3 {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        Login loginMethod = new Login();
        // informs user to enter name,lastname, and username
        String Firstname;
        String Lastname;
        // print out what the system says to the individual
        System.out.println("Please enter your first name:");
        Firstname = st.nextLine();
        System.out.println("Please enter your Surname:");
        Lastname = st.nextLine();
        System.out.println("Please enter your username");
        String username = st.nextLine();
        // if statments to check if all the requiremts for username are met
        if (loginMethod.checkUserName(username) == true) {
            System.out.println("Username is correct");
            System.out.println("Please enter password");
            String password = st.nextLine();
            // if statement to see if all reuiremnts for password have been met
            if (loginMethod.checkPasswordComplexity(password) == true) {
                System.out.println("password is correct");
                System.out.println(loginMethod.registerUser(username, password));
                String userNameCheck = st.nextLine();
                System.out.println("Enter Password to login");
                String passWordcheck = st.nextLine();
                // if statement greeting the user 
                if (loginMethod.loginUser(username, password, userNameCheck, passWordcheck) == true) {
                    System.out.println(loginMethod.returnLoginStatus("Sucessful login"));
                    System.out.println("welcome" + Firstname + Lastname + "its great to see you again");

                }
                // We using JOptionPane 
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
                String Options = null;
                Scanner sc = new Scanner(System.in);
                // first drop down menu 
                JOptionPane.showInputDialog(null, "1.add task" + "\n\t" + "2.Show report" + "\n\t" + "3.quit");
                switch (Options) {
                    case "add task":
                        // the diffrent types of strings and what the sytem is going to ask the user to enter 
                        System.out.println("Enter the number of tasks");
                        int Tasknumber = sc.nextInt();
                        sc.nextLine();
                        //
                        String[] DeveloperName = new String[Tasknumber];
                        String[] TaskName = new String[Tasknumber];
                        String[] TaskDescription = new String[Tasknumber];
                        String[] TaskID = new String[Tasknumber];
                        int [] Duration = new int[Tasknumber];
                        String[] Taskstatus = new String[Tasknumber];
                        
                        for (int i = 0; i < Tasknumber; i++) {
                            System.out.println("Enter Developer name");
                            DeveloperName[i] = sc.nextLine();
                            System.out.println("Enter Task Name");
                            TaskName[i] = sc.nextLine();
                            System.out.println("Enter Task Description");
                            TaskDescription[i] = sc.nextLine();
                            System.out.println("Enter Task Duration");
                            Duration[i] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter TaskID");
                            TaskID[i] =sc.nextLine();
                            System.out.println("Enter Task Status");
                            Taskstatus[i]= sc.nextLine();
                            
                           
           
    
                        ShowArray(TaskName,TaskDescription,Duration);
                        // the conditons taken for task 2 class
                        Task2 obj = new Task2();
                        obj.checkTaskDescription(obj.checkTaskDescription(TaskDescription[i]));
                        String developerName = Firstname + Lastname;
                        obj.checkTaskID(obj.TaskName,Tasknumber , DeveloperName);
                        obj.printTaskDetails(TaskName, Tasknumber, TaskDescription[i], Firstname, Lastname, Duration, TaskID[i], Taskstatus);
                        String enterdHours = "HH";
                        String numTask
                                = obj.returnTotalHours(numTask, enterdHours);

                        String TaskStatus = "";
                        int status = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose choose from one of the following options " + "\n\t"
                                + "1) TO DO" + "\n\t" + "2)DOING" + "\n\t" + "3) DONE"));
                        while (status == 0 || status > 3) {
                            JOptionPane.showMessageDialog(null, "You did not enter the correct options please try again");
                            status = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose choose from one of the following options " + "\n\t"
                                    + "1) To Do" + "\n\t" + "2)Doing" + "\n\t" + "3) Done"));
                        }
                        switch (status) {
                            case 1 ->
                                TaskStatus = "To DO";
                            case 2 ->
                                TaskStatus = "Doing";
                            case 3 ->
                                TaskStatus = "Done";

                            default -> {
                                    ;
                        }

                            }

                  
                 
         
                  
           break;
                        }
                    case "Show report":
                        }
            
                 private static void PrintArray(String[] TaskName,String[] TaskStatus,int[] Duration) {
                 for (int i = 0; i < TaskName.length ; i++) {
                  System.out.println("Task name " + i+" is "+ TaskName[i] );      
                  System.out.println("Task Status" + i +" is "+TaskStatus[i]);
                  System.out.println("Task Duration" + i +" is "+ Duration[i]);

                }
                 }
                public static void LongestDuration(int[] Duration){
                    System.out.println();
                    
                    int largest = 0;
                    for (int i =1; i< Duration.length;i++) {
                        if (Duration[i] > Duration [largest]){
                        largest = i;
                        }
                    }
                }
                           
               public static void SearchArray(String[] TaskName, String[] TaskDecription, int[] Duration) {
                for (int i = 0; i < TaskName.length; i++) {
               if (TaskName[i].equalsIgnoreCase(Tasknumber[i])) {
                System.out.println("TaskName " + i + " " + TaskName[i]);
                System.out.println("Task Description " + i + " " + TaskDecription[i]);
                System.out.println("Task Duration " + i + " " + Duration[i]);
                
               }
                }
               }

    private static void ShowArray(String[] TaskName, String[] TaskDescription, int[] Duration) {
    }
              
               public String[] deleteStrings(String[]delete, String[] Taskname,String del){
                   String[] detailsD = new String[delete.length];
                   
                   for(int i = 0; i < delete.length; i++){
                       if (Taskname[i].equalsIgnoreCase(del)){
                           detailsD = ArrayUtils.remove(delete,i);
                       }
                       return detailsD;
                       
               }
        return null;
               }

                   public int[] deleteInts(int[] delete,String[]Taskname,String del){
                       int[] detailsD =new int[delete.length];
                       for (int i = 0; i < delete.length;i++){
                           if (Taskname[i].equalsIgnoreCase(del)) {
                               detailsD = ArrayUtils.remove(delete,i);
                               
                               return detailsD;
                           }
                       }
        return null;
       
                   }         
                   public static void Report(String[] report){
                       for (int i =0; i < report.length: i++){
                       System.out.println(report[1]);
                       
                   }
                   }
              
                       public static void Done(String[] Developers, int[] Duration, String [] Taskstatus, String [] Taskname) {
                       if(Taskstatus[i].equalsIgnoreCase("Done")){
                           System.out.println("Developer" + Developers + Taskname + Duration + Taskstatus);
                   }
                   
                    
                     

                        
                        }
                        

                        break;
                     
                   
            }
        }
                case "quit":

                   }
}
        }
}
}

            
        
    

