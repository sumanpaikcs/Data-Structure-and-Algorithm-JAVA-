public class Linearsearch {
    
    static int linearelement( int[] arr, int key ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
               System.out.println(arr[i]);
                
            } else {
               System.out.println("not found");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 43 ,98};
        int key = 45;
        
        System.out.println(linearelement(arr, key));
        

    }
}
