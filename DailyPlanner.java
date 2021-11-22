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

  public static Event readEvent(Scanner scnr) {
      eventMonth = scnr.nextInt();
      eventDay = scnr.nextInt();
      eventYear = scnr.nextInt();
      eventHour = scnr.nextInt();
      eventName = "";
      while (scnr.next() != "|") {
          eventName += scnr.next();
      }

      Event event = new Event(eventName, eventMonth, eventDay, eventYear, eventHour);
      return event;
  }



  public static void main(String[] args) {
      Month[] months = new Month[12];
      if (args.length != 2) {
          System.out.println("Usage: java -cp bin DailyPlanner infile.txt outfile.txt");
          System.exit(1);
      }

      Scanner fileInputScanner = new Scanner(new FileInputStream(args[0]));
      String askLoop = "y";

      for (int i = 0; i < months.length; i++) {
          switch (i) {
              case 1:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 2:
                months[i] = new Month(TWENTY_EIGHT_DAYS, i, args[0]);
                break;
              case 3:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 4:
                months[i] = new Month(THIRTY_DAYS, i, args[0]);
                break;
              case 5:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 6:
                months[i] = new Month(THIRTY_DAYS, i, args[0]);
                break;
              case 7:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 8:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 9:
                months[i] = new Month(THIRTY_DAYS, i, args[0]);
                break;
              case 10:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              case 11:
                months[i] = new Month(THIRTY_DAYS, i, args[0]);
                break;
              case 12:
                months[i] = new Month(THIRTY_ONE_DAYS, i, args[0]);
                break;
              default:
          }
      }

      while (scnr.hasNext()) {
          months[eventMonth].addEvent(readEvent(fileInputScanner));
      } //Trying to use the event month obtained from the readEvent method to add that event to said month by using the variable.

      // while (askLoop != "n") {
      //     System.out.print();
      // }

      for (int i = 0; i < months.length; i++) {
          System.out.print(months[i].toString());
      }

  }
}
