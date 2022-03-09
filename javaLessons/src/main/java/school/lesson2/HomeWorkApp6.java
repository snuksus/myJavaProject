package school.lesson2;

public class HomeWorkApp6 {
    public static void fillArray(int size){
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            arr[i] = i+1;
            System.out.print(arr[i]+" ");
        }
    }
}
