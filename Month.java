import java.io.*;
import java.util.*;


/**
 * Constructs and returns information about months object

object
 * @author Alexi McNabb
 * @author Matthew Zhang
 * @author Parker Bennett
 * @author Karan Patel
 * //TOOD: Add all authors
 */
public class Month {
  public final int MAX_EVENTS = 200;

  /** Number of days in the month */
  private int numberOfDays;

  /** Number of the month in order */
  private int monthNumber;

  /** Array containing the events during the month */
  private Event[] events;

  /** Name of the input file */
  private String inputFile;

  /** Scanner to take file input */
  private Scanner scnr;

  /** Number of events during the month */
  private int eventCount;



  /**
   * Constructs a new month object
   * @param numberOfDays the number of days in the month
   * @param monthNumber the number of the month (January = 1 etc)
   * @param inputFile the name of the file to be used as input
   * @param eventCount the number of events taking place during the month
   */
  public Month(int numberOfDays, int monthNumber, String inputFile) {
      this.numberOfDays = numberOfDays;
      this.monthNumber = monthNumber;
      this.inputFile = inputFile;
      this.scnr = new Scanner(new FileInputStream(inputFile));
      this.eventCount = eventCount;
      this.events = new Event[MAX_EVENTS];

  }

  /**
   * Returns the month as a string
   * @return string containing the name of the month and all events during it
   */
  public String toString() {
      String s = "";
      s += "Month: ";
      switch (monthNumber) {
          case 1:
            s += "January";
            break;
          case 2:
            s += "February";
            break;
          case 3:
            s += "March";
            break;
          case 4:
            s += "April";
            break;
          case 5:
            s += "May";
            break;
          case 6:
            s += "June";
            break;
          case 7:
            s += "July";
            break;
          case 8:
            s += "August";
            break;
          case 9:
            s += "September";
            break;
          case 10:
            s += "October";
            break;
          case 11:
            s += "November";
            break;
          case 12:
            s += "December";
            break;
          default:
            s+= "Error";
            break;
      }

      for (int i = 0; i < events.length; i++) {
          if (events[i] != null) {
              s += "\n" + events[i].toString();
          }
      }

      s += "\nNumber of events: " + eventCount;

      return s;

  }


  /**
   * Adds an event to the events array
   * @params scnr scanner
   * @param event to be added
   */
  public void addEvent(Event event) {
      for (int i = 0; i < events.length; i++) {
          if (events[i] == null) {
              events[i] = event;
              eventCount++;
              break;
          }
      }
  }

  /**
  * Determines whether or not two Month objects are identical to one another
  *
  * @param o Object represents another Month objects
  * @returns boolean true or false depending on whether or not the two objects equal
  */
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    else {
        return false;
    }
    if (o instanceof Month) {
      if (((Month)o).numberOfDays == this.numberOfDays &&
         ((Month)o).inputFile == this.inputFile && ((Month)o).scnr == this.scnr &&
         ((Month)o).eventCount == this.eventCount && ((Month)o).events == this.events) {
        return true;
      }
      else {
          return false;
      }
    }
    else {
        return false;
    }

  }


  /**
   * Gets the array of the event list
   * @return event arra y
   */
  public Event[] getEventList() {
      return events;

  }


  /**
   * Gets the month number
   * @return int monthNumber
   */
  public int getMonthNumber() {
      return monthNumber;
  }


}
