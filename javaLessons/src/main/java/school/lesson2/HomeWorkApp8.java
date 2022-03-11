package school.lesson2;

public class HomeWorkApp8 {
    public static void fillDiagonal(){
        int [][] arr= new int[3][3];
        for (int i =1; i<3; i++){
            for (int j=0; j<0; j++){
                if (i==j){
                    arr[i][j]=1;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
