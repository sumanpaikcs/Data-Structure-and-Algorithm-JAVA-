public class DSAlinearSearch {
    public static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 37 };
        int key = 37;
        int result = linearsearch(arr, key);
        if (result == -1) {
            System.out.println("No eliment");
        } else {
            System.out.println("Eliment found" + result);

        }

    }
}