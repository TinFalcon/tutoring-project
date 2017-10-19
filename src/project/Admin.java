package project;

import main.Utilities;

//Admin class. Right now, it can only add subjects.
public class Admin extends User
{
//Basic constructor. Just calls the User constructor.
public Admin(String name)
{
  super(name);
}
  
//Method for the admin to add subjects to the list
public void addSubject()
{
  //Prompt for the subject name
  System.out.print("\nPlease input the name of the subject: ");
    
  //Iterate through the array
  for(int i = 0; i < User.MAX_SUBJECTS; i++)
  {
    //If there's an empty spot, the Admin will be prompted for the name
    //Method will return after successful input
    if(User.subjectList[i] == null)
    {
      String tempSubjectName = Utilities.scanner.nextLine();
      User.subjectList[i] = new Subject(tempSubjectName);
      return;
    }
  }
    
  //If the subject isn't successfully added (i.e. full list), this
  //error message will be printed.
  System.out.println("\nError: Unable to add subject!");
}
}
