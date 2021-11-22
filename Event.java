/**
 * Constructs and returns information about events object
 object
 * @author Alexi McNabb
 * @author Matthew Zhang
 * @author Parker Bennett
 * @author Karan Patel
 * //TOOD: Add all authors
 */
public class Event {

    /** Name of the event */
    private String eventName;

    /** Month that the event occurs in */
    private Month month;

    /** Date the event occurs on */
    private int day;

    /** Time the event occurs, if there is one */
    private int time;

    /** Year the event occurs */
    private int year;

    /**
     * Constructs an events object with time
     * @param name String name of the event
     * @param month Month of the event
     * @param day int date of the event
     * @param year int year of the event
     * @parm time military time of the event
     */
    public Event(String name, Month month, int day, int year, int time) {
      eventName = name;
      this.month = month;
      this.day = day;
      this.time = time;
      this.year = year;
    }

    /**
     * Constructs an events object with no time
     * @param name String name of the event
     * @param month Month of the event
     * @param day int date of the event
     * @param year int year of the event
     */
    public Event(String name, Month month, int day, int year) {
        eventName = name;
        this.month = month;
        this.day = day;
        this.year = year;
        time = -1;
    }

    /**
     * Returns the name of the event as a string
     * @return name of the event
     */
    public String getEventName() {
      return eventName;
    }

    /**
     * Gets the month the event occurs in
     * @return Month object of the event
     */
    public Month getEventMonth() {
      return month;
    }

    /**
     * Gets the day of the event
     * @return int day of the event
     */
    public int getEventDay() {
      return day;
    }

    /**
     * Gets the time of the event, or null if none was supplied
     * @return int time or null
     */
    public int getEventTime() {
      if (time != -1) {
          return time;
      }
      else {
          return null;
      }
    }

    /**
     * Gets the year of the event
     * @return int year
     */
    public int geteventYear() {
        return year;
    }

    /**
     * Compares two events for equality
     * @param o other event/object to compare against
     * @return true if the events are the same, false otherwise
     */
    public boolean equals(Object o) {
        if (o instanceof Events) {
            Events other = (Events)o;
            if (eventName.equals(other.eventName) && month.equals(other.month) &&
                day == other.day && time == other.time && year == other.year) {
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
     * Returns the event as a string
     * @return name, month, day, year, and time as a string
     */
    public String toString() {
        String s = "";
        int monthNum = month.getMonthNumber();

        if (monthNum < 10) {
            s += "0";
        }
        s += monthNum + "    ";

        if (day < 10) {
            s += 0;
        }
        s += day + "    ";

        s += year;

        if (time != -1) {
            if (time < 10) {
                s += "  0" + time;
            }
            else {
                s += "  " + time;
            }
        }
        s += "\n";
        s += eventName;
        return s;
    }

}
