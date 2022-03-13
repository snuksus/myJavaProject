package school.lesson2;

public class HomeWorkApp4_1 {
    public static boolean day365Or366(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
