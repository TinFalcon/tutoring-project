package project;

import main.Utilities;

//Parent class for all User types
public abstract class User {
  // TODO Add all instance variables common to all users.

  // User's name. Pretty much just there so a constructor could get started.
  public String name;

  // Constant for the maximum number of subjects; current value is arbitrary
  protected static final int MAX_SUBJECTS = 50;

  // Subject list. Static and accessible to all Users.
  protected static Subject[] subjectList = new Subject[MAX_SUBJECTS];

  // Basic constructor. Just there so a better one can be made later.
  public User(String name) {
    this.name = name;
  }

  // Method allowing any User to view the subject list
  public void printSubjectList() {
    System.out.println("\nSubject list:\n");
    // Iterate through the array
    for (int i = 0; i < MAX_SUBJECTS; i++) {
      // If there's a subject, print it
      if (subjectList[i] != null) {
        System.out.println(i + ". " + subjectList[i].subjectName);
      }
      // Else, end the function. This has dangerous implications we need
      // to plan for.
      else {
        return;
      }
    }
  }

  // Method allowing any User to view the availabilities of a given subject
  public void viewAvailabilties() {
    // Integer for subject selection
    int courseNum = 0;

    // Boolean to help with input checking
    Boolean validCourse = false;

    // While there isn't a selected valid course...
    while (!validCourse) {
      // Prompt for the subject number
      System.out.println(
          "\nWhich subject would you like to view " + "availabilities for?");

      // Print the list of subjects to choose from
      this.printSubjectList();

      // Read in the subject number
      System.out.print("\nEnter your choice number: ");
      courseNum = Integer.valueOf(Utilities.scanner.nextLine());

      // If the subject number is for an existing course...
      if (courseNum >= 0 && courseNum < Subject.numSubjects) {
        // ...set the bool to true to break the while loop.
        validCourse = true;
      }
      // Else, display an error message and go through the loop again
      else {
        System.out
            .println("\nInvalid input! Please select a valid " + "subject.");
      }
    }

    // Print the availabilities of the selected subject
    subjectList[courseNum].printAvailabilities();
  }
}
