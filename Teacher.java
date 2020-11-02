public class Time{
    int hours;
    int minutes;
    Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public int TimeinMinutes(){
        return this.hours*60 + this.minutes;
    }
}

public class TeacherOneDay{
    String name;
    int TimeSpan;
    int StartTime;
    int EndTime;
    TeacherOneDay(String name, Time StartTime, Time EndTime){
        this.name = name;
        this.StartTime = StartTime.TimeinMinutes();
        this.EndTime = EndTime.TimeinMinutes();
        this. TimeSpan = this.EndTime - this.StarTime;
    }
}

