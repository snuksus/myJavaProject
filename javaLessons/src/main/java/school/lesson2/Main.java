package school.lesson2;

import static school.lesson2.HomeWorkApp1.within10and20;
import static school.lesson2.HomeWorkApp2.isPositiveOrNegative;
import static school.lesson2.HomeWorkApp3.isTrue;
import static school.lesson2.HomeWorkApp4.printLine;
import static school.lesson2.HomeWorkApp4_1.day365Or366;
import static school.lesson2.HomeWorkApp5.invertArray;
import static school.lesson2.HomeWorkApp6.fillArray;
import static school.lesson2.HomeWorkApp7.changeArray;
import static school.lesson2.HomeWorkApp8.fillDiagonal;
import static school.lesson2.HomeWorkApp9.returnArray;

public class Main {
    public static void main (String[] Args){
        System.out.println(within10and20(1,9));
        isPositiveOrNegative(9);
        System.out.println(isTrue(-15));
        printLine("Akula",10);
        System.out.println(day365Or366(1850));

        int[] arr5 = {1,1,0,0,1,0,1,1,0,0};
        invertArray(arr5);

        System.out.println();
        fillArray(100);

        int[] arr7 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(arr7);
        changeArray(arr7);

        System.out.println();
        fillDiagonal();

        returnArray(5,1);
    }
}
