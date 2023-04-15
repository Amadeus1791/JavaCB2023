package unit08;

public class More2DMethods {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(getOtherDiagonalSum1(arr));


    }

    static int getMainDiagonalSum1(int[][] arr) {
        //0,0  0,1  0,2
        //1,0  1,1  1,2
        //2,0  2,1  2,2
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    static int getMainDiagonalSum2(int[][] arr) {
        //0,0  0,1  0,2
        //1,0  1,1  1,2
        //2,0  2,1  2,2
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    static int getOtherDiagonalSum1(int[][] arr) {
        //0,0  0,1  0,2
        //1,0  1,1  1,2
        //2,0  2,1  2,2
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (i + j == arr.length - 1)
                    sum += arr[i][j];
            }
        }
        return sum;
    }
}
