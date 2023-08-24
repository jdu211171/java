class Time {
  static int hour, minute, second;

  public Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  };
  
  int getTime(){
    return this.hour;
  };
}

class TimeTable extends Time {
  static String Subject;
  static int StartTime, Classroom;

  public TimeTable(int hour, int minute, int second, String Subject, int StartTime, int Classroom){
    super(hour, minute, second);
    this.Subject = Subject;
    this.StartTime = StartTime;
    this.Classroom = Classroom;
  };

  String getSubject(){
    return this.Subject;
  };

  int getStartTime(){
    return this.StartTime;
  }
}

public class Inheritance {
  public static void main(String[] args){
    TimeTable timeTable1 = new TimeTable(1, 0, 0, "Math", 12, 103);
    TimeTable timeTable2 = new TimeTable(1, 0, 0, "Physics", 13, 104);
    TimeTable timeTable3 = new TimeTable(1, 0, 0, "Chemistry", 14, 105);
    TimeTable timeTable4 = new TimeTable(1, 0, 0, "Art", 15, 106);
    TimeTable timeTable5 = new TimeTable(1, 0, 0, "English", 16, 107);
    TimeTable subjects[] = {timeTable1, timeTable2, timeTable3, timeTable4, timeTable5};
    Time time1 = new Time(12, 0, 0);
    int i = 0;
    while(i < 5){
      if (subjects[i].getStartTime() == time1.getTime()) System.out.println(subjects[i].getSubject());
      i++;
    }
  }
}