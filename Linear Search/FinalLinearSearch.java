public class FinalLinearSearch {
    
    public static void main(String[] args){
        int[] array = {12, 45, 3, 65, 23, 78, 90, 43};
        int target = 100;
        int answer = linearsearch(array, target);
        System.out.println(answer);

    }
    public static int linearsearch(int[] searcharray, int target){
        if (searcharray.length ==0) {
            System.out.println("nothing exists");
            
        }
        for(int index=0; index < searcharray.length; index++){
            if (target == searcharray[index]) {
                System.out.println(index);
                return target;
                
            }
        }
        System.out.println("doesnot exists");
        return Integer.MAX_VALUE;
    }
    
}
