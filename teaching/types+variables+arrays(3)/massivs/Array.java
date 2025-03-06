package massivs;

class Array {
    // использование одномерного массива.
    public static void main(String[] args) {
        // int[] mounth_days;
        // mounth_days = new int[12];
        int[] mounth_days = new int[12];
        mounth_days[0] = 31;
        mounth_days[1] = 28;
        mounth_days[2] = 31;
        mounth_days[3] = 30;
        mounth_days[4] = 31;
        mounth_days[5] = 30;
        mounth_days[6] = 31;
        mounth_days[7] = 31;
        mounth_days[8] = 30;
        mounth_days[9] = 31;
        mounth_days[10] = 30;
        mounth_days[11] = 31;
        System.out.println("В апреле " + mounth_days[3] + " дней.");
    }
}