package unit08;

public class Medals {
    public static void main(String[] args) {
        final int NUMB_OF_COUNTRIES = 8;
        final int NUMB_OF_MEDAlS = 3;
        String[] countries = {"Deutschland", "Vereinigte Staaten", "Österreich",
                "Russland", "Kanada", "Schweden", "Südkorea", "Schweiz"};
        int[][] medals = {{11, 12, 6}, {9, 9, 7}, {9, 7, 7}, {8, 6, 8},
                {7, 10, 7}, {7, 2, 5}, {6, 3, 2}, {5, 4, 5}};

        // i = i+1
        // print(i+1)
        // without method
        for (int i = 0; i < medals.length; i++) {
            int sum = 0;
            System.out.print((i + 1) + ". " + countries[i] + ": ");
            for (int j = 0; j < medals[i].length; j++) {
                sum += medals[i][j];
                System.out.print(medals[i][j]);
                if (j != medals[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" --> Medals in total: " + sum);
        }

        // with sum method
        int[] sum = array2DToSum(medals);
        for (int i = 0; i < medals.length; i++) {
            System.out.print((i + 1) + ". " + countries[i] + ": ");
            for (int j = 0; j < medals[i].length; j++) {
                System.out.print(medals[i][j]);
                if (j != medals[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" --> Medals in total: " + sum[i] );
        }

        int[] silverMedals = getSilverMedals(medals);


    }

    static int[] array2DToSum(int[][] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            newArray[i] = sum;
        }
        return newArray;
    }

    static int[] getSilverMedals(int[][] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArray[i] = arr[i][1];
            }
        }
        return newArray;
    }
}
