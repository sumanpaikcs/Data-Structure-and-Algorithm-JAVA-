package Array;
public class LoopsThroughAnArray {
    public static void main(String[] args) {
        
        String[] count = {"one", "two", "three", "four", "five"};
        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
            
        }

        for (String show : count) {
            System.out.println(show);
            
        }
    }
    
}
