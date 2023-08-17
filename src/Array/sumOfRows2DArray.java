package Array;

public class sumOfRows2DArray {
    public static void main(String[] args) {
        int [][] arr= {
                {1,5},
                {7,3,1},
                {3,5}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int max=0;
        int rowCount=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                rowCount=rowCount+arr[i][j];

            }
            if(rowCount>max){
                max=rowCount;
                rowCount=0;

            }
            rowCount=0;
        }
        return max;
    }
}
