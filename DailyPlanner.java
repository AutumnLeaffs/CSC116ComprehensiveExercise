import java.util.*;
import java.io.*;


public class DailyPlanner {
  public final int numberOfMonths = 12;

  public Event[] events;

  public static int eventMonth;
  public static int eventDay;
  public static int eventYear;
  public static int eventHour;
  public static String eventName;

  public static final int THIRTY_DAYS = 30;
  public static final int THIRTY_ONE_DAYS = 31;
  public static final int TWENTY_EIGHT_DAYS = 28;
  public static final int LEAP_MONTH = 29;
  public static String fileName = "";

  
  public static void main(String[] args) {
      Month[] months = new Month[12];
      Scanner fileInputScanner = null;
      if (args.length != 2) {
          System.out.println("Usage: java -cp bin DailyPlanner infile.txt outfile.txt");
          System.exit(1);
      }
      
      fileName = args[0];
      try { 
        fileInputScanner = new Scanner(new FileInputStream(args[0]));
      }
      catch (IOException o){
          System.out.println("File Error");
      }
      
      String askLoop = "y";

      for (int i = 0; i < months.length; i++) {
          switch (i) {
              case 1:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 2:
                try {
                    months[i] = new Month(TWENTY_EIGHT_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 3:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 4:
                try {
                    months[i] = new Month(THIRTY_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 5:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 6:
                try {
                    months[i] = new Month(THIRTY_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 7:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 8:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 9:
                try {
                    months[i] = new Month(THIRTY_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 10:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 11:
                try {
                    months[i] = new Month(THIRTY_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 12:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              default:
          }
      }

      while (fileInputScanner.hasNext()) {
          months[eventMonth].addEvent(readEvent(fileInputScanner));
      } //Trying to use the event month obtained from the readEvent method to add that event to said month by using the variable.

      // while (askLoop != "n") {
      //     System.out.print();
      // }

      for (int i = 0; i < months.length; i++) {
          System.out.print(months[i].toString());
      }

  }
  
  public static Event readEvent(Scanner scnr) {
      eventMonth = scnr.nextInt();
      eventDay = scnr.nextInt();
      eventYear = scnr.nextInt();
      eventHour = scnr.nextInt();
      eventName = "";
      Month eventMonthModifier = null;
      while (scnr.next() != "|") {
          eventName += scnr.next();
      }
      
      if (eventMonth % 2 == 0 && eventMonth != 2) {
          try {
            eventMonthModifier = new Month(30, eventMonth, fileName);
          }
          catch (IOException o){
            System.out.println("Event Error");
          }
          //Month(int numberOfDays, int monthNumber, String inputFile)
      }
      else if (eventMonth % 2 == 0 && eventMonth == 2) {
          try {
            eventMonthModifier = new Month(28, eventMonth, fileName);
          }
          catch (IOException o){
            System.out.println("Event Error");
          }
      }
      else {
          try {
            eventMonthModifier = new Month(31, eventMonth, fileName);
          }
          catch (IOException o){
            System.out.println("Event Error");
          }
          
      }

      Event event = new Event(eventName, eventMonthModifier, eventDay, eventYear, eventHour);
      return event;
  }
}
