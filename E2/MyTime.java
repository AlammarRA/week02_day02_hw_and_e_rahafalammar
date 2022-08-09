package E2;

public class MyTime {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour , int minute , int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws IllegalArgumentException{
        if(hour >= 0 && hour <= 23 ) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws IllegalArgumentException{
        if(minute >= 0 && minute <= 59 ) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws IllegalArgumentException {
        if(second >= 0 && second <= 59 ) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    @Override
    public String toString() {
        return "\"" + hour +
                ":" + minute +
                ":" + second + "\"" ;
    }


    public MyTime nextSecond(){
        if(this.second == 59) {
            this.second = 0;
            nextMinute();
        } else {
            setTime(hour, minute, ++second);
        }
            return this;
    }

    public MyTime nextMinute(){
        if(this.minute == 59) {
            this.minute =0;
            nextHour();
        } else {
            setTime(hour, ++minute, second);
        }
        return this;
    }

    public MyTime nextHour(){
        if(this.hour == 24) {
            this.hour = 0;
        } else {
            setSecond(0);
            setMinute(0);
            setTime(++hour, minute, second);
        }
        return this;
    }

    public MyTime previousSecond(){
        try {
            setTime(hour, minute, --second);
            return this;
        }
        catch(IllegalArgumentException e) {}
        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute(){
        try {
            setTime(hour, --minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}
        minute = 59;
        return previousHour();
    }

    public MyTime previousHour(){
        try {
            setTime(--hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;
    }

}
