package school.lesson2;

public class HomeWorkApp5 {
    public static void invertArray(int[] arr){
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i< arr.length;i++) {
            if (arr[i] ==0){
                arr[i] =1;
            } else{
                arr[i] = 0;
            }
            System.out.print(arr[i]+" ")
        }
    }
}
