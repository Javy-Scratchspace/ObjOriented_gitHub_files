public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2, 29, 2020);
        System.out.println(date.getNextDay().getNextDay());

        date = new MyDate(6, 9, 2025);
        MyDate date2 = date; // NOTE: This is a pointer reference, not a copy
        date2.goToNextDay(); // Similar to pointer reference 

        System.out.println(date);

        date = new MyDate(6, 9, 2025);
        date2 = date.getNextDay();

        date.goToNextDay();
        date2.getNextDay();

        System.out.println(date);
        System.out.println(date2);
    }
}
