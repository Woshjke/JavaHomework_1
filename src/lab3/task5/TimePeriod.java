package lab3.task5;

public class TimePeriod {
    private int seconds;
    private int minutes;
    private int hours;

    public TimePeriod (int sec) throws Exception {
        if (sec < 0) {
            throw new Exception("second param < 0");
        }
        hours = sec / 3600;
        sec -= hours * 3600;
        minutes = sec / 60;
        sec -= minutes * 60;
        seconds = sec;
    }

    public TimePeriod(int hours, int minutes, int seconds) throws Exception {
        if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new Exception("Some param < 0");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void showPeriod() {
        System.out.println("Time period: " + hours + ":" + minutes + ":" + seconds);
    }

    public void showPeriodInSeconds() {
        System.out.println("Time period in seconds: " + ((hours * 3600) + (minutes * 60) + seconds));
    }
}
