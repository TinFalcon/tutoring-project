package project;

import main.Utilities;

//Tutor class. Just a constructor for now.
public class Tutor extends User
{ 
//Another basic constructor.
public Tutor(String name)
{
  super(name);
}

//Method for adding an availability for a subject
public void addAvailability()
{
  //Temporary storage for input values
  int tempMonth;
  int tempDay;
  int tempHour;
  int tempMinute;
  
  //Integer for subject selection
  int courseNum = 0;
  
  //Boolean to help with input checking
  Boolean validCourse = false;
  
  //While there isn't a selected valid course...
  while(!validCourse)
  {
    //Prompt for the subject number
    System.out.println("\nWhich subject would you like to sign up "
        + "for?");
    
    //Print the list of subjects to choose from
    this.printSubjectList();
    
    //Read in the subject number
    System.out.print("\nEnter your choice number: ");
    courseNum = Integer.valueOf(Utilities.scanner.nextLine());
    
    //If the subject number is for an existing course...
    if(courseNum >= 0 && courseNum < Subject.numSubjects)
    {
      //...set the bool to true to break the while loop.
      validCourse = true;
    }
    //Else, display an error message and go through the loop again
    else
    {
      System.out.println("\nInvalid input! Please select a valid "
          + "subject.");
    }
  }
      
  //Iterate through the array
  for(int i = 0; i < Subject.MAX_SLOTS; i++)
  {
    //If there's space for the availability, it will create it.
    //Then, end the function.
    if(User.subjectList[courseNum].availabilities[i] == null)
    {
      //Prompt for and read in Time values
      System.out.print("Please input the month: ");
      tempMonth = Integer.valueOf(Utilities.scanner.nextLine());
      
      System.out.print("Please input the day: ");
      tempDay = Integer.valueOf(Utilities.scanner.nextLine());
      
      System.out.print("Please input the hour: ");
      tempHour = Integer.valueOf(Utilities.scanner.nextLine());
      
      System.out.print("Please input the minute: ");
      tempMinute = Integer.valueOf(Utilities.scanner.nextLine());
      
      User.subjectList[courseNum].availabilities[i] = 
          new Time(this.name, tempMonth, tempDay, tempHour, 
              tempMinute);
      return;
    }
  }
  //If the time isn't successfully added (i.e. full list), this
  //error message will be printed.
  System.out.println("\nError: Unable to add availability!");
}
}
