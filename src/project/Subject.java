package project;

//Class to store info on a subject
public class Subject {
  // Tracks the subject's name
  protected String subjectName;

  // Tracks the number of Subjects
  public static int numSubjects = 0;

  // Constant for the maximum number of availabilities; current value is
  // arbitrary
  protected static final int MAX_SLOTS = 50;

  // Each subject has an array of availabilities
  protected Time[] availabilities = new Time[MAX_SLOTS];

  // Constructor
  public Subject(String subjectName) {
    this.subjectName = subjectName;
    numSubjects++;
  }

  // Method for printing the availabilities
  public void printAvailabilities() {
    System.out.println("\nAvailabities for " + this.subjectName + ":\n");

    // Iterate through the array
    for (int i = 0; i < MAX_SLOTS; i++) {
      // If there's an availability, print it.
      if (this.availabilities[i] != null) {
        System.out.print(i + ". " + availabilities[i]);
      }
      // Else, end the function. This has dangerous implications we need
      // to plan for.
      else {
        return;
      }
    }
  }
}
