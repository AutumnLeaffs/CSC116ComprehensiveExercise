import java.util.*;
import java.io.*;


public class DailyPlanner {
  public static final int NUMBER_OF_MONTHS = 12;
  public static final int MAX_EVENTS = 200;
  public static final int THIRTY_DAYS = 30;
  public static final int THIRTY_ONE_DAYS = 31;
  public static final int TWENTY_EIGHT_DAYS = 28;
  public static final int LEAP_MONTH = 29;

  public static Event[] events = new Event[MAX_EVENTS];
  public static Month[] months = new Month[NUMBER_OF_MONTHS];

  public static int eventMonthGlobal;
  public static String fileName = "";


  public static void main(String[] args) {

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
              case 0:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 1:
                try {
                    months[i] = new Month(TWENTY_EIGHT_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 2:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 3:
                try {
                    months[i] = new Month(THIRTY_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 4:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 5:
                try {
                    months[i] = new Month(THIRTY_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 6:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 7:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 8:
                try {
                    months[i] = new Month(THIRTY_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 9:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 10:
                try {
                    months[i] = new Month(THIRTY_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              case 11:
                try {
                    months[i] = new Month(THIRTY_ONE_DAYS, i + 1, args[0]);
                }
                catch (IOException o){
                    System.out.println("File Error");
                }
                break;
              default:
          }
      }

      while (fileInputScanner.hasNext()) {
          int eventInteration = 0;
          events[eventInteration] = readEvent(fileInputScanner);
          eventInteration++;
      }

      for (int i = 0; i < months.length; i++) {
          System.out.print(months[i].toString() + "\n");
      }

  }

  public static Event readEvent(Scanner scnr) {
      int eventMonth = scnr.nextInt();
      eventMonthGlobal = eventMonth;
      int eventDay = scnr.nextInt();
      int eventYear = scnr.nextInt();
      int eventHour = scnr.nextInt();
      String eventName = "";
      // Month eventMonthModifier = null;

      while (scnr.hasNext()) {
          String token = scnr.next();
            if (token.equals("|")) {
                break;
            }
          eventName += token + " ";
      }

      // if (eventMonth % 2 == 0 && eventMonth != 2) {
      //     try {
      //       eventMonthModifier = new Month(30, eventMonth, fileName);
      //     }
      //     catch (IOException o){
      //       System.out.println("Event Error");
      //     }
      //     //Month(int numberOfDays, int monthNumber, String inputFile)
      // }
      // else if (eventMonth % 2 == 0 && eventMonth == 2) {
      //     try {
      //       eventMonthModifier = new Month(28, eventMonth, fileName);
      //     }
      //     catch (IOException o){
      //       System.out.println("Event Error");
      //     }
      // }
      // else {
      //     try {
      //       eventMonthModifier = new Month(31, eventMonth, fileName);
      //     }
      //     catch (IOException o){
      //       System.out.println("Event Error");
      //     }
      //
      // }

      Event event = new Event(eventName, months[eventMonth - 1], eventDay, eventYear, eventHour);
      months[eventMonth - 1].addEvent(event);
      return event;
  }
}
