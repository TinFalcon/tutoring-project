package project;

//Class to store time info about an availability
public class Time {
  // Stores the name of the tutor
  protected String tutorName;

  // Self-explanatory member variables; I think I can make these private,
  // but I'll mess with that later
  protected int month;
  protected int day;
  protected int hour;
  protected int minute;

  // Constructor
  public Time(String tutorName, int month, int day, int hour, int minute) {
    this.tutorName = tutorName;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
  }

  // toString method to make printing easier
  public String toString() {
    return String.format("Tutor: %s Date: %d/%d Time: %d:%02d\n", tutorName,
        month, day, hour, minute);
  }
}
