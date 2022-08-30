package Array;
public class twoDarray {
    public static void main(String[] args) {

        // index 0 1 2
        int[][] arr = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
        // index 0 1 2 3 0 1 2 3 0 1 2 3

        int num = arr[2][2];
        System.out.println(num);

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }

}

// 0 1 2 3
// 4 5 6 7
// 8 9 10 11