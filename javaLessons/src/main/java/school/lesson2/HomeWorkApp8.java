package school.lesson2;

public class HomeWorkApp8 {
    public static void fillDiagonal(){
        int[][] arr= {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i==j){
                    arr[i][j]=1;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
