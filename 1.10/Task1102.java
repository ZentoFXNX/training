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

    // Метод для перевода минут в секунды
    public int minutesToSeconds(int minutes) {
        return minutes * seconds;
    }

    // Метод для перевода часов в секунды
    public int hoursToSeconds(int hours) {
        return hours * minutesToSeconds(minutes) * this.seconds;
    }

    // Метод для вычисления секунд в сутках
    public int dayInSeconds() {
        return hours * minutes * seconds;
    }

    // Метод для вычисления секунд в году
    public int yearInSeconds() {
        return daysInYear * dayInSeconds();
    }

    public static void main(String[] args) {
        Task1102 timer = new Task1102();
        
        System.out.println("Секунд в сутках: " + timer.hoursToSeconds(1));
        // System.out.println("Секунд в году: " + timer.yearInSeconds());
    }
}