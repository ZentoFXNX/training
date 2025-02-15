public class light {
    // Рассчитать расстояние проходимое светом,
    // с приминением переменных типа long.
    public static void main(String[] args) {
        int lightspeed;
        long days, seconds, distance;
        // Приблизительная скорость света в милях за секунду.
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60; // указать кол-во дней, преобразовать в секунды, рассчитать в расстояние.
        distance = lightspeed * seconds;
        // Вывести примерное расстояние в милях, проходимое светом
        // за указанное количество дней.
        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль.");
    }
}

// результат бы не уместился в int
