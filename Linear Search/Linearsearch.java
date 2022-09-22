public class Linearsearch {
    
    static void linearelement( int[] arr, int key ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
               System.out.println(arr[i]);
               continue;
            } 
            else{
                System.out.println("Not Found");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 43 ,98};
        int key = 45;
        
        linearelement(arr, key);
        

    }
}
