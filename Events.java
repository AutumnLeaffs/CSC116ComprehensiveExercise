public Events {
    private String eventName;
    private Month month;
    private int day;
    private int time;

    public Events(String name, Month month, int day, int time) {
      eventName = name;
      this.month = month;
      this.day = day;
      this.time = time;
    }

    public Events(String name, Month month, int day) {
        eventName = name;
        this.month = month;
        this.day = day;
        time = -1;
    }

    public String getEventName() {
      return eventName;
    }

    public Month getEventMonth() {
      return month;
    }

    public int getEventDay() {
      return day;
    }

    public int getEventTime() {
      if (time != -1) {
          return time;
      }
      else {
          return null;
      }
    }

    public boolean equals(Object o) {
        if (o instanceof Events) {
            Events other = (Events)o;
            if (eventName.equals(other.eventName) && month == other.month && day == other.day &&
                time == other.time) {
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
