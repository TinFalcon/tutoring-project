package main;

import project.*;

public class Main {
  //Starting point of the program
  public static void main(String[] args)
  {
    //Variable for menu control
    int userChoice = 0;
    
    //Initialize an object of each class of User
    Admin administrator = new Admin("Harrison Ford");
    Tutor tutor = new Tutor("Samuel L. Jackson");
    Student student = new Student("Bruce Willis");
    
    //Run the main menu
    ProjectDriver.mainMenu(userChoice, administrator, tutor, student);
  }
}
