public class Task1102 {
    public int hours;
    public int minutes;
    public int seconds;
    public int daysInYear;

    Task1102() {
        this.minutes = 60;
        this.hours = 24;
        this.seconds = 60;
        this.daysInYear = 365;
    }

    public int minutesToSeconds(int minutes) {
        return minutes * seconds;
    }

    public int hoursToSeconds(int hours) {
        return hours * minutes * seconds;
    }

    public int dayInSeconds() {
        return hours * minutes * seconds;
    }

    public int yearInSeconds() {
        return daysInYear * dayInSeconds();
    }

    public static void main(String[] args) {
        Task1102 timer = new Task1102();
        
        System.out.println("Секунд в сутках: " + timer.dayInSeconds());
        System.out.println("Секунд в году: " + timer.yearInSeconds());
    }
}