public class linearSearchAlgorithm {

    public static int linearsearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67};
        int key = 45;
        int result = linearsearch(arr, key);

        if (result == -1) {
            System.out.println("Enement not found.");
        } else {
 System.out.println("Element found at the index of " + result);
        }

    }
    
}
