public class PracticeArray{
    public static void main(String[] args) {
        // int[] arr = {1, 3, 4, 6, 7, 8 ,9 };
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println("the length of the array is : " + arr.length);


        // 2D Array
        int[][] arr = {
                       {1,2,3,4}, 
                       {5,6,7,8}, 
                       {9,10,11,12},
                       {13,14,15,16}
                      };

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            
         }               
         System.out.println("  Element is : " + arr[2][0]);
    }
}