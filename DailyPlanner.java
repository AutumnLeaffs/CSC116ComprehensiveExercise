public DailyPlanner {
  public final int numberOfMonths = 12;

  public Events[] events;
  public Month[] months = new Month[12];

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
      this.eventMonth = scnr.nextInt();
      this.eventDay = scnr.nextInt();
      this.eventYear = scnr.nextInt();
      this.eventHour = scnr.nextInt();
      this.eventName = "";
      while (scnr.next() != "|") {
          this.eventName += scnr.next();
      }

      Event event = new Event(name, month, day, year, hour);
      return event;
  }



  public static void main(String[] args) {

      if (args.length != 2) {
          System.out.println("Usage: java -cp bin DailyPlanner infile.txt outfile.txt");
          System.exit(1);
      }

      Scanner scnr = new Scanner(new FileInputStream args[0]);
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

      while (scnr.hasNext) {


      }
      while (askLoop != "n") {
          System.out.print();
      }

  }
}
