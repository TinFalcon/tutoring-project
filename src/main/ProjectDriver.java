package main;

import project.*;

/*
 * Driver file for the project. Contains the menu functions and the main 
 * method. The program will initialize a User of all three classes. In order to
 * use all of the features, you will want to log in as an Admin and create a 
 * few subjects. You can create up to 50, but I doubt you guys will take it 
 * that far. After that, log out and back in as a Tutor to add a few 
 * availabilities. Again, you can add up to 50 per subject, but I doubt you'll 
 * want to. The Student log in can only view, which the other two can do, too.
 */
 
public class ProjectDriver
{
  //Function for the main menu
  public static void mainMenu(int userChoice, Admin administrator, 
      Tutor tutor, Student student)
  {
    //Welcome message
    System.out.println("Welcome to the Marshmallow Bandits Tutoring "
        + "Center!");
    
    //While the user does not choose to log off...
    while(userChoice != 4)
    {
      //Print the menu choices
      System.out.println("\nWhich type of user are you?");
      System.out.println("1. Administrator");
      System.out.println("2. Tutor");
      System.out.println("3. Student");
      System.out.println("4. Exit");
      
      //Prompt for and read in the user's menu selection
      System.out.print("\nEnter your choice numer: ");
      userChoice = Integer.valueOf(Utilities.scanner.nextLine());
      
      //Switch statement for choosing the next menu based on the 
      //user's menu selection.
      switch(userChoice)
      {
      //Launches the Admin menu. userChoice is reset to zero to avoid
      //premature while loop breakage in another menu.
      case 1:
        userChoice = 0;
        adminMenu(userChoice, administrator);
        break;
      //Launches the Tutor menu
      case 2:
        userChoice = 0;
        tutorMenu(userChoice, tutor);
        break;
      //Launches the Student menu
      case 3:
        userChoice = 0;
        studentMenu(userChoice, student);
        break;
      //Displays an exit message and gives control back to main, which 
      //makes no other calls. This effectively ends the program.
      case 4:
        System.out.println("\nThank you for stopping by!");
        break;
      //The menu will prompt the user for proper input if the default is
      //reached.
      default:
        System.out.println("Invalid input! Please select a menu item.");
        break;
      }
    }
  }
  
  //Menu for Admin users
  public static void adminMenu(int userChoice, Admin administrator)
  {
    //Welcome message
    System.out.println("\nWelcome, Administrator " + administrator.name + 
        "!");
    
    //While the Admin does not choose to log off...
    while(userChoice != 4)
    {
      //Print the menu choices
      System.out.println("\nWhat would you like to do?");
      System.out.println("1. View subject list");
      System.out.println("2. Add a subject");
      System.out.println("3. View tutor availability for a subject");
      System.out.println("4. Log off");
      
      //Prompt for and read in the user's menu selection
      System.out.print("\nEnter your choice numer: ");
      userChoice = Integer.valueOf(Utilities.scanner.nextLine());
      
      //Switch statement for choosing the correct method based on  
      //user's menu selection.
      switch(userChoice)
      {
      //Prints the list of subjects
      case 1:
        administrator.printSubjectList();
        break;
      //Allows the Admin to attempt to add a subject to the list
      case 2:
        administrator.addSubject();
        break;
      //Allows the Admin to view Tutor availabilities by subject
      case 3:
        administrator.viewAvailabilties();
        break;
      //Prints an exit message and gives control back to the main menu
      case 4:
        System.out.println("\nGoodbye, " + administrator.name + "!");
        break;
      //The menu will prompt the user for proper input if the default is
      //reached.
      default:
        System.out.println("\nInvalid input! Please select a menu "
            + "item.");
        break;  
      }
    }
    
    //Reset userChoice
    userChoice = 0;
  }
  
  //Menu for Tutor users
  public static void tutorMenu(int userChoice, Tutor tutor)
  {
    //Welcome message
    System.out.println("\nWelcome, Tutor " + tutor.name + "!");
    
    //While the Tutor choose to not log off...
    while(userChoice != 4)
    {
      //Print the menu choices
      System.out.println("\nWhat would you like to do?");
      System.out.println("1. View subject list");
      System.out.println("2. Add availability for a subject");
      System.out.println("3. View tutor availability for a subject");
      System.out.println("4. Log off");
      
      //Prompt for and read in the user's menu selection
      System.out.print("\nEnter your choice numer: ");
      userChoice = Integer.valueOf(Utilities.scanner.nextLine());
      
      //Switch statement for choosing the correct method based on  
      //user's menu selection.
      switch(userChoice)
      {
      //Prints the list of subjects
      case 1:
        tutor.printSubjectList();
        break;
      //Allows the Tutor to attempt to add an availability to a subject
      case 2:
        tutor.addAvailability();
        break;
      //Allows the Tutor to view Tutor availabilities by subject
      case 3:
        tutor.viewAvailabilties();
        break;
      //Prints an exit message and gives control back to the main menu
      case 4:
        System.out.println("\nGoodbye, " + tutor.name + "!");
        break;
      //The menu will prompt the user for proper input if the default is
      //reached.
      default:
        System.out.println("\nInvalid input! Please select a menu "
            + "item.");
        break;  
      }
    }
    
    //Resets userChoice
    userChoice = 0;
  }
  
  //Menu for Student users
  public static void studentMenu(int userChoice, Student student)
  {
    //Welcome message
    System.out.println("\nWelcome, Student " + student.name + "!");
    
    //While the Student choose to not log off...
    while(userChoice != 3)
    {
      //Print the menu choices
      System.out.println("\nWhat would you like to do?");
      System.out.println("1. View subject list");
      System.out.println("2. View tutor availability for a subject");
      System.out.println("3. Log off");
      
      //Prompt for and read in the user's menu selection
      System.out.print("\nEnter your choice numer: ");
      userChoice = Integer.valueOf(Utilities.scanner.nextLine());
      
      //Switch statement for choosing the correct method based on  
      //user's menu selection.
      switch(userChoice)
      {
      //Prints the list of subjects
      case 1:
        student.printSubjectList();
        break;
      //Allows the Student to view Tutor availabilities by subject
      case 2:
        student.viewAvailabilties();
        break;
      //Prints an exit message and gives control back to the main menu
      case 3:
        System.out.println("\nGoodbye, " + student.name + "!");
        break;
      //The menu will prompt the user for proper input if the default is
      //reached.
      default:
        System.out.println("\nInvalid input! Please select a menu "
            + "item.");
        break;  
      }
    }
    
    //Resets userChoice
    userChoice = 0;
  }
}
