public class Linearsearch{
    public static void main(String[] args){
        int[] arraycollection = {12, 34, 56, 78, 32, 54, 76, 89, 33, 55, 44, 22, 99};
        int target = 99;
        int answer = linearsearchalgo(arraycollection, target);
        System.out.print(answer);     // output : 12
    }

    // linear search function
    public static int linearsearchalgo(int[] array, int target){
        if(array.length == 0){
            System.out.println("Array does not exists");
        }
        for (int index = 0; index < array.length; index++) {
            if (target == array[index]) {
                return index;
                
            }
        }
        return Integer.MAX_VALUE;

    }

}