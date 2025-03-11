// public class Task192 {
//     public int hours;
//     public int min;
//     public int sec;

//     Task192() {
//         min = 60;
//         hours = 24;
//         sec = 60;
//     }

//     public void day() {
//         System.out.println(hours * min * sec);
//     }
// }

// class Task192Main {
//     public static void main(String[] args) {
//         Task192 timer = new Task192();
//         timer.day();
//     }
// }

public class Task192 {
    public int hours;
    public int minutes;
    public int seconds;

    // Конструктор
    Task192() {
        this.minutes = 60;
        this.hours = 24;
        this.seconds = 60;
    }

    // Метод для перевода минут в секунды
    public int seconds(int minutes) {
        return minutes * this.seconds;
    }

    // Метод для перевода часов в секунды
    public int minutes(int hours) {
        return hours * this.minutes;
    }

    // Метод для вычисления секунд в сутках
    public int hours() {
        return this.hours * this.minutes * this.seconds;
    }

    public static void main(String[] args) {
        Task192 timer = new Task192();
        System.out.println("Секунд в сутках: " + timer.seconds(1));
    }
}