package school.lesson2;

public class HomeWorkApp9 {
    public static void  returnArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i] = initialValue;
            System.out.print(i+arr[i]+" ");
        }
    }
}

